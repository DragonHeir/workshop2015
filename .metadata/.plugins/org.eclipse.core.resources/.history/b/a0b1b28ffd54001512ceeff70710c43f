package Level_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jointheleague.graphical.robot.Robot;

public class Generator implements ActionListener
{

	JFrame GenFrame;
	JPanel GenPanel;
	JLabel Sides;
	JLabel SideLength;
	JLabel PenSize;
	JLabel PenColor;
	JLabel Speed;
	JTextField SidesTF;
	JTextField SideLengthTF;
	JTextField PenSizeTF;
	JTextField PenColorTF;
	JTextField SpeedTF;
	JButton Generate;

	public static void main(String[] args)
	{
		Generator g = new Generator();

	}

	public Generator()
	{
		GenFrame = new JFrame();
		GenPanel = new JPanel();
		Sides = new JLabel("Sides = ");
		SidesTF = new JTextField(10);
		SideLength = new JLabel("Side Length = ");
		SideLengthTF = new JTextField(10);
		PenSize = new JLabel("Pen Size = ");
		PenSizeTF = new JTextField(10);
		PenColor = new JLabel("Pen Color = ");
		PenColorTF = new JTextField(10);
		Speed = new JLabel("Speed = ");
		SpeedTF = new JTextField(10);
		Generate = new JButton("Generate");
		GenFrame.setVisible(true);
		GenFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GenFrame.setSize(260, 230);
		GenFrame.add(GenPanel);
		GenPanel.add(Sides);
		GenPanel.add(SidesTF);
		GenPanel.add(SideLength);
		GenPanel.add(SideLengthTF);
		GenPanel.add(PenSize);
		GenPanel.add(PenSizeTF);
		GenPanel.add(PenColor);
		GenPanel.add(PenColorTF);
		GenPanel.add(Speed);
		GenPanel.add(SpeedTF);
		GenPanel.add(Generate);
		Generate.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Robot bobby = new Robot();
	}

}
