import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myapplet extends Applet{
	Label l1,l2,l3;
	Button b1,b2,b3,b4;
	public void init(){
	l1=new Label("Hello");
	l2=new Label("back");
	l3=new Label("fore");
	b1=new Button("red");
	b2=new Button("yellow");
	b3=new Button("blue");
	b4=new Button("pink");
	add(l1);
	add(l2);
	add(b1);
	add(b2);
	add(l3);
	add(b3);
	add(b4);
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			l1.setBackground(Color.red);
		}
	});
	b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			l1.setBackground(Color.yellow);
		}
	});
	b3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			l1.setForeground(Color.blue);
		}
	});
	b4.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			l1.setForeground(Color.pink);
		}
	});
	}
	
	
}
