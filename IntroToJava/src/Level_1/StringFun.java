package Level_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StringFun implements ActionListener
{
	JFrame Frame;
	JPanel Panel;
	JTextField Decoded;
	JTextField Encoded;
	JButton Translate;

	public static void main(String[] args)
	{
		StringFun SF = new StringFun();
	}

	public StringFun()
	{
		Frame = new JFrame();
		Panel = new JPanel();
		Decoded = new JTextField(50);
		Translate = new JButton("Reverse");
		Encoded = new JTextField(50);

		Frame.add(Panel);
		Panel.add(Decoded);
		Panel.add(Translate);
		Panel.add(Encoded);
		Translate.addActionListener(this);

		Frame.setVisible(true);
		Frame.setSize(0, 0);
		Frame.pack();
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String x = Decoded.getText();
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		for (int i = 0; i < x.length(); i++)
		{

		}
	}
}
