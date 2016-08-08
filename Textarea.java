import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Textarea implements ActionListener {
	
		JFrame f;
		JTextArea t;
		MenuBar mb;
		Menu File, Edit, Help;
		MenuItem new1,exit,copy,paste,select,cut,about;
		String author;
		
		public Textarea() {
			
		author = "\n\n\tThis is a simple text editor made with <3 in Java using Swing."
				+ "\n\tIt uses JtextArea that offers predefined functions for editing."
				+ "\n\n\t@Myeditor";	
			
		f = new JFrame("MyEditor");
		f.setSize(500, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mb = new MenuBar();	
		t = new JTextArea();
		
		File = new Menu("File");
		File.add(new1 = new MenuItem("New"));
		File.add(exit = new MenuItem("Exit"));

		Edit = new Menu("Edit");
		Edit.add(copy = new MenuItem("Copy"));
		Edit.add(cut = new MenuItem("Cut"));
		Edit.add(paste = new MenuItem("Paste"));
		Edit.add(select = new MenuItem("Select"));
		
		Help = new Menu("Help");
		Help.add(about = new MenuItem("About"));
		
		mb.add(File);
		mb.add(Edit);
		mb.add(Help);
		
		f.setMenuBar(mb);
		f.add(t);
		
		new1.addActionListener(this);
		exit.addActionListener(this);
		copy.addActionListener(this);
		cut.addActionListener(this);
		paste.addActionListener(this);
		select.addActionListener(this);
		about.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==new1) {
			t.setText("");
		}
		
		else if(e.getSource()==exit) {
			f.setVisible(false);
		}
		
		else if(e.getSource()==copy) {
			t.copy();
		}
		
		else if(e.getSource()==cut) {
			t.cut();
		}
		
		else if(e.getSource()==paste) {
			t.paste();
		}
		
		else if(e.getSource()==select) {
			t.selectAll();
		}
		else if(e.getSource()==about) {
			t.setText(author);
		}
		
	}
	
	public static void main(String arg[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Textarea();
			}
		});
	}

}
