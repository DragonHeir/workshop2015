package Level_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener
{
	JFrame Frame1;
	JPanel Panel1;
	JTextField Number;
	JButton Convert;
	JLabel NumberText;
	JLabel BinaryText;
	int y;

	public static void main(String[] args)
	{
		BinaryConverter g = new BinaryConverter();
	}

	public BinaryConverter()
	{
		Frame1 = new JFrame();
		Frame1.setVisible(true);
		Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel1 = new JPanel();
		Number = new JTextField(4);
		Convert = new JButton("Convert");
		NumberText = new JLabel("Number (4 digits max.) - ");
		BinaryText = new JLabel();
		Frame1.pack();
		Frame1.setSize(290, 100);

		Frame1.add(Panel1);
		Panel1.add(NumberText);
		Panel1.add(Number);
		Panel1.add(Convert);
		Convert.addActionListener(this);

		String x = Number.getText();
		y = Integer.parseInt(x);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == Convert)
		{

		}

	}
}
