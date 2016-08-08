package comparisions;


import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;



public class SwingsDemo extends Applet {
	public SwingsDemo() {
	}
	Container c;
	public void init(){
		
		setBackground(Color.blue);
		
	}
	public void paint(Graphics g){
		g.drawString("height is "+getHeight(), 0, 10);
		g.drawString("width is "+getWidth(), 0, 30);
		
	}

}
