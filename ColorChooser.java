import java.awt.*;
import java.awt.event.*;
public class ColorChooser {
	Frame frame=new Frame("Color Demo");
	Panel p1=new Panel();
	Panel p2=new Panel();
	TextArea ta=new TextArea(15,15);
	CheckboxGroup grp=new CheckboxGroup();
	Checkbox forecolor=new Checkbox("Foreground ",grp,true);
	Checkbox backcolor=new Checkbox("Background ",grp,false);
	Button b1=new Button("Red");
	Button b2=new Button("Green");
	Button b3=new Button("Blue");
	Button b4=new Button("Yellow");
	Button b5=new Button("PINK");
	Button b6=new Button("BLACK");
	
	Button clear=new Button("Clear");
	public ColorChooser(){
		frame.setLayout(new BorderLayout());
		frame.setSize(800,800);
		b1.setBackground(Color.RED);
		b2.setBackground(Color.GREEN);
		b3.setBackground(Color.BLUE);
		b4.setBackground(Color.YELLOW);
		b5.setBackground(Color.PINK);
		b6.setBackground(Color.BLACK);
		
		clear.setBackground(Color.WHITE);
		p1.add(forecolor);
		p1.add(backcolor);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(clear);
		p2.setLayout(new BorderLayout());
		p2.add(ta,BorderLayout.CENTER);
		ta.setFont(new Font("Arial",1,20));
		frame.add(p1,BorderLayout.NORTH);
		frame.add(p2,BorderLayout.CENTER);
		frame.setLocation(450, 300);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	});
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			  if(forecolor.getState()==true)
				  ta.setForeground(Color.RED);
			  else
				  ta.setBackground(Color.RED);
				
			}
		});
        b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			  if(forecolor.getState()==true)
				  ta.setForeground(Color.GREEN);
			  else
				  ta.setBackground(Color.GREEN);
				
			}
		});

       b3.addActionListener(new ActionListener() {
	
	    @Override
	    public void actionPerformed(ActionEvent e) {
	           if(forecolor.getState()==true)
		         ta.setForeground(Color.BLUE);
	           else
		         ta.setBackground(Color.BLUE);
	    }
		
	    });
       
	    b4.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	           if(forecolor.getState()==true)
		         ta.setForeground(Color.YELLOW);
	           else
		         ta.setBackground(Color.YELLOW);
	           }
	    });
	    b5.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	           if(forecolor.getState()==true)
		         ta.setForeground(Color.PINK);
	           else
		         ta.setBackground(Color.PINK);
		
	}});
	    b6.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	           if(forecolor.getState()==true)
		         ta.setForeground(Color.BLACK);
	           else
		         ta.setBackground(Color.BLACK);
		
	}
	    });
	    clear.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	           if(forecolor.getState()==true)
		         ta.setForeground(Color.WHITE);
	           else
		         ta.setBackground(Color.WHITE);
		
	}
});

	}

	public static void main(String[] args) {
		new ColorChooser();

	}

}
