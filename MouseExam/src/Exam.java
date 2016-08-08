
import java.awt.*;

import javax.swing.*;

class Exam extends JFrame{
	JLabel[] label;
	
	public Exam() {
/*		JFrame frame = new JFrame("SWING Frame");
		frame.setLayout(null);*/
		
		super("Swing Frame");
		
		label = new JLabel[10];
		label[0] = new JLabel("1. How many JDBC driver types does Sun defines? ");
		
/*		label[1] = new JLabel("2. Who invented JAVA ? ");
		label[2] = new JLabel("3. To run compiled Java program, the machine must have what loaded and running ");
		label[3] = new JLabel("4. ___ is a open source DBMS product that runs on Linux and Windows");
		label[4] = new JLabel("5. What MySQL property is used to create a surrogate key in MySQL?");
		label[5] = new JLabel("6. A JSP is transformed into ___ ");
		label[6] = new JLabel("7. What programming or scripting language does JSP support?");
		label[7] = new JLabel("8. What is Bytecode ? ");
		label[8] = new JLabel("9. How many copies of JSP page can be in memory at a time?");
		label[9] = new JLabel("10. What JDBC driver type(s) is (are) the JDBC ODBC bridge");*/
		
		label[0].setBounds(47, 23, 200, 20);
		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.add(label[0]);
		Options[] options = new Options[10];
		
		options[0] = new Options("A. One", "B. Two", "C. Three", "D. Four");
		
/*		options[1] = new Options("A. Netscape", "B. Microsoft", "C. Sun", "D. None of these");
		options[2] = new Options("A. JVM", "B. JC", "C. Java Bytecode", "D. Browser");
		options[3] = new Options("A. MySQL", "B. JSP/SQL", "C. JDBC/SQL", "D. Sun Access");
		options[4] = new Options("A. UNIQUE", "B. SEQUENCE", "C. AUTO INCREMENT", "D. None of these");
		options[5] = new Options("A. Java applet", "B. Java servlet", "C. All above", "D. None");
		options[6] = new Options("A. VBScript", "B. JScript", "C. Java", "D. All above");
		options[7] = new Options("A. Machine specific code", "B. Java code", "C. machine independent code", "D. None of these");
		options[8] = new Options("A. One", "B. Two", "C. Three", "D. Unlimited");
		options[9] = new Options("A. Type 1", "B. Type 2", "C. Type 3", "D. Type  4");*/
		
		options[0].jrbtn[0].setBounds(50, 60, 57, 23);
		options[0].jrbtn[1].setBounds(165, 60, 57, 23);
		options[0].jrbtn[2].setBounds(280, 60, 57, 23);
		options[0].jrbtn[3].setBounds(395, 60, 57, 23);
		
		for(int i = 0; i < 1; i++)
		{
			add(label[i]);
			for(int j = 0; j < 4; j++)
			{
				add(options[i].jrbtn[j]);
			}
		}
		add(new JButton("Submit"));
		setLayout(new GridLayout(6,4,3,3));
		setVisible(true);

	}
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run() 
			{
					new Exam();
			}
		});
	}


}





class Options {
	public JRadioButton[] jrbtn;
	public Options(String a, String b, String c, String d) {
		jrbtn = new JRadioButton[4];
		jrbtn[0] = new JRadioButton(a);
		jrbtn[1] = new JRadioButton(b);
		jrbtn[2] = new JRadioButton(c);
		jrbtn[3] = new JRadioButton(d);
		
		ButtonGroup group = new ButtonGroup();
		JRadioButton r;
		for(JRadioButton rr:jrbtn)
		{
			group.add(rr);
		}

	}

}