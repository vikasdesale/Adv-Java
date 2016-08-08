package studyOfApplets;

import java.awt.*;

import javax.swing.*;


public class SwingsDemo extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container c;
	int ht,wt;
		public void init(){
		c=getParent();
		c.setBackground(Color.RED);
	}
	public void paint(Graphics g){
		g.drawString("height is "+getHeight(), 150, 70);
		g.drawString("width is "+getWidth(), 150, 90);
		}
}
