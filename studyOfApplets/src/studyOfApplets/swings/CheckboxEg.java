package studyOfApplets.swings;



import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JApplet;
import javax.swing.JCheckBox;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class CheckboxEg extends JApplet implements ItemListener{
	String str="";
	JCheckBox a,m,b,gr;
	public void init(){
		a=new JCheckBox("Apple");
		m=new JCheckBox("Mango");
		b=new JCheckBox("Banana");
		gr=new JCheckBox("Grapes");
		
		add(gr);
		add(a);
		add(m);
		add(b);
		
		a.addItemListener(this);
		b.addItemListener(this);
		m.addItemListener(this);
		gr.addItemListener(this);
		
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
		
	}
	public void paint(Graphics g){
		g.drawString("Current Statys", 100, 50);
		//g.drawString("Apple "+((Object) a).getState(), 100, 70);
		//g.drawString("", 1, 2);
	}

}
