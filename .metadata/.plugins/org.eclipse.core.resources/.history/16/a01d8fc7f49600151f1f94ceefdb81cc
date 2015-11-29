package Level_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Buttons implements ActionListener
{
	int u = 0;
	int d = 1;
	int l = 2;
	int r = 3;
	int direction = -1;
	
	JFrame Frame = new JFrame("Buttons");
	JPanel Panel = new JPanel();
	JButton Up = new JButton("UP");
	JButton Down = new JButton("DOWN");
	JButton Left = new JButton("LEFT");
	JButton Right = new JButton("RIGHT");
	
	
	public static void main(String[] args)
	{
		
		Buttons x = new Buttons();
		
	}
	
	Buttons()
	{
		Frame.add(Panel);
		Panel.add(Up);
		Panel.add(Down);
		Panel.add(Left);
		Panel.add(Right);
		
		Up.addActionListener(this);
		Down.addActionListener(this);
		Left.addActionListener(this);
		Right.addActionListener(this);	
		
		Frame.setVisible(true);
		Frame.setSize(100, 100);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == Up)
		{
			if(direction != u)
			{				
				System.out.println("UP");
				direction = u;
			}
		}
		if(e.getSource() == Down)
		{
			if(direction != d)
			{				
				System.out.println("DOWN");
				direction = d;
			}
		}
		if(e.getSource() == Left)
		{
			if(direction != l)
			{				
				System.out.println("LEFT");
				direction = l;
			}
		}
		if(e.getSource() == Right)
		{
			if(direction != r)
			{				
				System.out.println("RIGHT");
				direction = r;
			}
		}
	}
}
