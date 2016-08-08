
//JAVA PROGRAM FOR FOREGROUNG AND BACKGROUND COLOR

import java.awt.*;
 
import java.awt.event.*;
 
import java.applet.*;
 
/*
 <applet code="ColorDemo" width=400 height=400>
 
</applet>

*/
 
public class Foreground extends Applet implements ActionListener
 
{

 
Button red;
Button blue;
Button green;
Button red1;
Button blue1;
Button green1;
Label fore;
Label back;
Panel p1,p2;

public void init()
 
{
 p1=new Panel();
 p1.setLayout(new GridLayout(1,4));
 fore=new Label("Foreground");
 p1.add(fore);
 red1=new Button("Red");
 green1=new Button("Blue");
 blue1=new Button("Green");
 p1.add(red1);
 p1.add(green1);
 p1.add(blue1);
 p2=new Panel();
 
 
 p2=new Panel();
 p2.setLayout(new GridLayout(1,4));
 back=new Label("Background");
 p2.add(back);
 red=new Button("Red");
 green=new Button("Blue");
 blue=new Button("Green");
 p2.add(red);
 p2.add(green);
 p2.add(blue);

 Panel p3=new Panel();
 Label l1=new Label("Foreground");
 p3.add(l1);
 
 red.addActionListener(this);
 blue.addActionListener(this);
 green.addActionListener(this);
 
 
 red1.addActionListener(this);
 blue1.addActionListener(this);
 green1.addActionListener(this);
}


public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==red)
	{
		setBackground(Color.RED);
	}else if(e.getSource()==green)
	{
		setBackground(Color.GREEN);
	}else if(e.getSource()==blue)
	{
		setBackground(Color.BLUE);
	}
	else if(e.getSource()==red1)
	{
		setBackground(Color.RED);
	}else if(e.getSource()==green1)
	{
		setBackground(Color.GREEN);
	}else
	{
		setBackground(Color.BLUE);
	}
	
}
}
 


        


