
import java.applet.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseE extends Applet implements MouseListener {
	
	int x, y;
	Label lbl;
	public void init(){
		lbl = new Label("This applet belongs to Mouse Listener");
		addMouseListener(this);
		add(lbl);
		lbl.setForeground(Color.RED);
	}
	
	public void paint(Graphics g){
		g.drawString(lbl.getText(), 40, 20);
		
	}
	
	public void mouseClicked(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		lbl.setText("Mouse Clicked " + x + ", " + y);
		repaint();
	}
	
	public void mouseEntered(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		lbl.setText("Mouse Entered " + x + ", " + y);
		repaint();
	}
	
	public void mouseExited(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		lbl.setText("Mouse Exited " + x + ", " + y);
		repaint();
	}
	
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		lbl.setText("Mouse Pressed " + x + ", " + y);
		repaint();
	}

	public void mouseReleased(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		lbl.setText("Mouse Released " + x + ", " + y);
		repaint();
	}
}
