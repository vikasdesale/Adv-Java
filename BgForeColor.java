//package CollegePrograms;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class BgForeColor extends Applet implements ActionListener {
	Label label1, label2, label3;
	Button b1, b2, b3, b4;
	public void init()
	{
		setSize(600, 100);
		label1 = new Label("Hello World");
		label1.setFont(new Font("Times New Roman", 1, 14));
		label2 = new Label("ForeColors");
		
		label3 = new Label("Back Colors");
		add(label1);
		add(label2);
		b1 = new Button("Red");
		b2 = new Button("Blue");
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(label3);
		b3 = new Button("Cyan");
		b4 = new Button("Green");
		add(b3);
		add(b4);
		b3.addActionListener(this);
		b4.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand() == "Red")
			label1.setForeground(Color.RED);
		
		else if(ae.getActionCommand() == "Blue")
			label1.setForeground(Color.BLUE);
		
		else
			label1.setForeground(Color.BLACK);
			
		 if(ae.getActionCommand() == "Cyan")
			label1.setBackground(Color.CYAN);
		
		else if(ae.getActionCommand() == "Green")
			label1.setBackground(Color.GREEN);

		else
			label1.setBackground(Color.WHITE);
		
	}

}
