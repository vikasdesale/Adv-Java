package studyOfApplets;

import java.applet.Applet;
/*
 * <applet code="ParamDemo" width=300 height=80>
 * <param name=fontName value=Courier>
 * <param name=fontSize value=14>
 * <param name=leading value=2>
 * <param name=accountEnabled value=true>
 * </applet>
 */
import java.awt.Graphics;

public class ParamDemo extends Applet{
	int Stopcount=0;
	String fontName;
	int fontSize;
	float leading;
	boolean active;
	//initialize the string to be displayed.
	public void start(){
		String param;
		fontName=getParameter("fontName");
		if(fontName==null)
			fontName="Not Found";
		param = getParameter("fontSize");
		try{
			if(param!=null)
				fontSize=Integer.parseInt(param);
			else fontSize=0;
		}catch(NumberFormatException e){
			fontSize=-1;
		}
		
		param=getParameter("leading");
		try{
			if(param!=null)
				leading=Float.parseFloat(param);
			else
				leading=0;
		}catch(NumberFormatException e){
			leading = -1;
		}
		param=getParameter("accountEnabled");
		if(param!=null)
			active=Boolean.parseBoolean(param);
		}
	public void paint(Graphics g){
		g.drawString("Fontname: "+fontName,0,10);
		g.drawString("Fontsize: "+fontSize,0,20);
		g.drawString("Leading: "+leading,0,30);
		g.drawString("Account active: "+active,0,40);
		g.drawString("You have stopped me "+Stopcount+" times!",0,50);
	}
	public void stop(){
		Stopcount++;
	}
}
