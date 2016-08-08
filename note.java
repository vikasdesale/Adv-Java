import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class note {
	JFrame f;
	JTextArea t;
	MenuBar mb;
	Menu file,edit;
	MenuItem new1,exit,cut,copy,paste,select;

	public note() {
		// TODO Auto-generated constructor stub
		
		
		f=new JFrame("editor");
		f.setSize(400,500);
		f.setVisible(true);
		
		mb=new MenuBar();
		t=new JTextArea();
		
		file=new Menu("file");
		file.add(new1=new MenuItem("new"));
		file.add(exit=new MenuItem("exit"));
		
		edit=new Menu("edit");
		edit.add(cut=new MenuItem("cut"));
		edit.add(copy=new MenuItem("copy"));
		edit.add(paste=new MenuItem("paste"));
		edit.add(select=new MenuItem("select all"));
		
		mb.add(file);
		mb.add(edit);
		
		f.setMenuBar(mb);
		f.add(t);
		
		new1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				t.setText("");
				
			}
		});
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				f.setVisible(false);
			}
		});
		copy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				t.copy();
				
			}
		});
		paste.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				t.paste();
			}
		});
		cut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				t.cut();
			}
		});
		select.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				t.selectAll();
			}
		});
		//exit.addActionListener(this);
		//copy.addActionListener(this);
		//cut.addActionListener(this);
		//paste.addActionListener(this);
		//select.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cut)
			t.cut();
		else if(e.getSource()==copy)
			t.copy();
		else if(e.getSource()==paste)
			t.paste();
		else if(e.getSource()==select)
			t.selectAll();
		else if(e.getSource()==new1)
			t.setText("");
		else
			t.setVisible(false);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new note();
			}
		});
	}

}
