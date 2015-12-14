package Level_1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener
{
	JFrame Frame;
	JPanel Panel;
	JButton Yellow;
	JButton Red;
	JButton Blue;
	JButton Green;
	public static void main(String[] args)
	{
		ColorTeacher a = new ColorTeacher();
	}
	ColorTeacher()
	{
		Frame = new JFrame("Color Teacher");
		Panel = new JPanel();
		Yellow = new JButton();
		Red = new JButton();
		Blue = new JButton();
		Green = new JButton();
		
		Frame.add(Panel);
		Panel.add(Yellow);
		Panel.add(Red);
		Panel.add(Blue);
		Panel.add(Green);
		
		Frame.setVisible(true);
		Frame.pack();
		
		Yellow.setBackground(Color.YELLOW);
		Yellow.setOpaque(true);
		Yellow.addActionListener((ActionListener) this);
		Red.setBackground(Color.RED);
		Red.setOpaque(true);
		Red.addActionListener((ActionListener) this);
		Blue.setBackground(Color.BLUE);
		Blue.setOpaque(true);
		Blue.addActionListener((ActionListener) this);
		Green.setBackground(Color.GREEN);
		Green.setOpaque(true);
		Green.addActionListener((ActionListener) this);
	}

		void speak(String Word)
		{
			try
			{
				Runtime.getRuntime().exec("say " + Word);
			}
			catch(IOException f)
			{
				f.printStackTrace();
			}
		}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == Yellow)
		{
			speak("Yellow");
		}
		if (e.getSource() == Red)
		{
			speak("Red");
		}
		if (e.getSource() == Blue)
		{
			speak("Blue");
		}
		if (e.getSource() == Green)
		{
			speak("Green");
		}
		
	}
}
