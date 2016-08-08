import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;


public class Notepad extends Frame implements ActionListener{
	
	
	
	private TextArea textArea=new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
	private MenuBar menuBar=new MenuBar();
	private Menu file=new Menu();
	private MenuItem openFile=new MenuItem();
	private MenuItem saveFile=new MenuItem();
	private MenuItem close=new MenuItem();
	
	String filename;
	public Notepad()
	{
		this.setSize(500,300);
		this.setTitle("Notepad");
		this.textArea.setFont(new Font("Century Gothic",Font.BOLD,12));
		
		this.setMenuBar(this.menuBar);
		this.menuBar.add(this.file);
		
		this.file.setLabel("File");
		
		this.openFile.setLabel("Open");
		this.openFile.addActionListener(this);
		this.openFile.setShortcut(new MenuShortcut(KeyEvent.VK_O,false));
		this.file.add(this.openFile);
		
		this.saveFile.setLabel("Save");
		this.saveFile.addActionListener(this);
		this.saveFile.setShortcut(new MenuShortcut(KeyEvent.VK_S,false));
		this.file.add(this.saveFile);
		
		
		this.close.setLabel("Close");
		this.close.addActionListener(this);
		this.file.add(this.close);
	}
public static void main(String args[])
{
	Notepad app=new Notepad();
	app.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==this.close)
	{
		this.dispose();
	}else if(e.getSource()==this.openFile)
	{
        JFileChooser open = new JFileChooser();
        int option = open.showOpenDialog(this);

  if (option == JFileChooser.APPROVE_OPTION) {
       this.textArea.setText("");
          	try {
	
          Scanner scan = new Scanner(new FileReader(open.getSelectedFile().getPath()));     
          while (scan.hasNext()) 
          this.textArea.append(scan.nextLine() + "\n");
	} 
catch (Exception ex) {System.out.println(ex.getMessage());}
}

	}else if(e.getSource()==this.saveFile)
	{
		JFileChooser save=new JFileChooser();
		int option=save.showSaveDialog(this);
		if(option==JFileChooser.APPROVE_OPTION)
		{
			try{
				BufferedWriter out=new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
				
				out.write(this.textArea.getText());
				out.close();
				
			}catch(Exception e1)
			{
				System.out.println(e1.getMessage());
			}
		}
	}
}
}
