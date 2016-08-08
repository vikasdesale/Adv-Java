package studyOfApplets;
import java.awt.*;
import java.applet.*;

public class Sample extends Applet{
	String msg;
	
	public void init(){
		setBackground(Color.CYAN);
		setForeground(Color.red); //capital(RED), small(red) both are acceptable
		msg = msg + "Inside init() --";
	}
	public void start(){
		msg = msg + "Inside start()--";
	}
	public void paint(Graphics g){
		//System.out.println(msg="helll");
		msg = msg + " Inside paint().";
		g.drawString(msg, 10,30 );
	}

}
