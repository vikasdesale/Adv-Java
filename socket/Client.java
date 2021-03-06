import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client implements Runnable, ActionListener {
	
	Frame f;
	TextField t;
	List l;
	Button b1, b2;
	
	Socket s;
	BufferedReader br;
	BufferedWriter bw;
	
	
	
	public Client() {
		f = new Frame("Client SCreen");
		f.setSize(300, 400);
		f.setLayout(new BorderLayout());
		b1 = new Button("Send");
		b2 = new Button("Exit");
		b1.addActionListener(this);
		b2.addActionListener(this);
		l = new List();
		t = new TextField();
		
		f.add(l, "Center");
		f.add(b1, "West");
		f.add(b2, "East");
		f.add(t, "South");
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
			
		});
		
		try {
			s= new Socket("127.0.0.1", 100);
			
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			
			bw.write("Hello");
			bw.newLine();
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Thread t= new Thread(this);
		t.start();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource().equals(b2))
			System.exit(0);
		else {
			try {
				bw.write(t.getText());
				bw.newLine();
				bw.flush();
				t.setText("");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		try {
			s.setSoTimeout(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			try {
				l.addItem(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String arg[]) {
		new Client();
	}

}
