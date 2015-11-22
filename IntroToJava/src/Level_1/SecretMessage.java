package Level_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SecretMessage implements ActionListener
{
	JFrame Frame;
	JPanel Panel;
	JButton Translate;
	JTextField Input;
	
	public static void main(String[] args)
	{
		//SecretMessage a = new SecretMessage();
		int i = 0;
		while(true)
		{
		char c = (char) i;
		System.out.println(i + " " + c);
		i++;
		}
	}
	
	SecretMessage()
	{
		Frame = new JFrame("Translator");
		Panel = new JPanel();
		Input = new JTextField(20);
		Translate = new JButton("Translate");
		
		Frame.add(Panel);
		Panel.add(Input);
		Panel.add(Translate);
		
		Frame.setVisible(true);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setSize(300, 100);
		
		Translate.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		String word = Input.getText();
		JOptionPane.showMessageDialog(Frame, Convert(word));
	}
	String Convert(String word)
	{
		String Translator = "";
		for (int i = 0; i < word.length(); i++)
		{
			char c = word.charAt(i);
			c += 1;
			Translator += c;
		}
		return Translator;
	}
}
