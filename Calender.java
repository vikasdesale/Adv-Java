import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//package MyCalender;


@SuppressWarnings("serial")
public class Calender extends Frame {
	Panel p1, p2;
	Integer k;
	Label month;
	public Calender(String name, int row, int col, int totaldays, int sdi) {
		super(name);
		setLayout(new BorderLayout());
		setSize(500, 450);
		setVisible(true);
		int i, j;
		k = 1;
		p1 = new Panel();
		p1.setLayout(new GridLayout(1, 7));
		p2 = new Panel();
		p2.setLayout(new GridLayout(row, col));
		
		month = new Label(name);
		Label[] label = new Label[7];
		label[0] = new Label("Mon");
		label[1] = new Label("Tue");
		label[2] = new Label("Wed");
		label[3] = new Label("Thu");
		label[4] = new Label("Fri");
		label[5] = new Label("Sat");
		label[6] = new Label("Sun");
		label[6].setForeground(Color.RED);
		
		for( i = 0; i < 7; i++)
		{	p1.add(label[i]);
			label[i].setFont(new Font("Times New Roman", 1,20));
		}
		
		Label dates[][] = new Label[row][col];
		for(i = 0; i < row; i++)
		{
			for(j = 0; j < col; j++)
			{
				if(k == totaldays + 1)
					break;
				else if(i == 0 && j >= sdi)
				{
					dates[i][j] = new Label(k.toString());
					dates[i][j].setFont(new Font("Times New Roman", 1,14));
					k++;
				}
				else if(i > 0)
				{
					dates[i][j] = new Label(k.toString());
					dates[i][j].setFont(new Font("Times New Roman", 1,14));
					k++;
				}
				else
				{
					dates[i][j] = new Label();
				}
			}
		}
		for(i = 0; i < row; i++)
		{
			if(dates[i][6] != null)
				dates[i][6].setForeground(Color.red);
		}
		try
		{
			for(i = 0; i < row; i++)
			{
				for(j = 0; j < col; j++)
				{
					p2.add(dates[i][j]);
				}
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		month.setFont(new Font("Times New Roman", 1, 16));
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(month, BorderLayout.SOUTH);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		
		});
	}
	public static void main(String[] args){
		new Calender("January", 5, 7, 31, 3);
	}
}

/*
//Program for January
package MyCalender;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")

public class January extends Calender{
	public January() {
		super("January", 5, 7, 31, 3);
	}
	
	public static void main(String[] args) {
		new January();
	}
}
*/