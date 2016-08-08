import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class Notepad implements ActionListener {
	File filename;
	JFrame wind = new JFrame("Notepad");
	JMenuBar mb = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenu edit = new JMenu("Edit");
	JMenu about = new JMenu("About");
	JMenuItem open = new JMenuItem("open");
	JMenuItem save = new JMenuItem("save");
	JTextArea ta = new JTextArea();
	public Notepad() {
		wind.setSize(400, 500);
		
		wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		file.add(open);
		file.add(save);
		mb.add(file);
		mb.add(edit);
		mb.add(about);
		wind.setJMenuBar(mb);
		wind.add(ta);
		open.addActionListener(this);
		wind.setVisible(true);
		
		
		
	}
	public static void main(String...args){
		new Notepad();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==open){
			JFileChooser filechooser = new JFileChooser();
			filechooser.showOpenDialog();
			filename = filechooser.getSelectedFile();
			try {
				BufferedReader br = new BufferedReader(new FileReader(filename));
				String curr;
				while((curr = br.readLine())!=null){
					ta.append(curr+"\n");
					
				}
				ta.append(filename.getAbsolutePath());
				
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
			
		}
		if(e.getSource()==save){
			String text = ta.getText();
			File file = filename;
			try {
				
				file = new File("c:/newfile.txt");
				FileOutputStream fop = new FileOutputStream(file);

				// if file doesnt exists, then create it
				if (!file.exists()) {
					file.createNewFile();
				}

				// get the content in bytes
				byte[] contentInBytes = text.getBytes();

				fop.write(contentInBytes);
				fop.flush();
				fop.close();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		
	}

}
