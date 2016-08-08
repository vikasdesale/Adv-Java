package studyOfApplets;
import java.awt.*;
import java.applet.*;
public class StatusWindow extends Applet{
	public void init(){
		setBackground(Color.BLUE);
	}
	//Display msg in applet window
	public void paint(Graphics g){
		g.drawString("This is shown in the applet window",10,20);
		showStatus("This is displayed in the status window");//instead of "Applet started."
	}
	

}
