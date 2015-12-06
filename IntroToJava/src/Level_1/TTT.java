package Level_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TTT implements ActionListener
{
JFrame Frame;
JPanel Panel;
JTextField Field1;
JTextField Field2;
JTextField Field3;
JTextField Field4;
JTextField Field5;
JTextField Field6;
JTextField Field7;
JTextField Field8;
JTextField Field9;
JButton Button;
public static void main(String[] args)
{
	TTT a = new TTT();
}
TTT()
{
	Frame = new JFrame("Tic Tac Toe");
	Panel = new JPanel();
	Field1 = new JTextField(1);
	Field2 = new JTextField(1);
	Field3 = new JTextField(1);
	Field4 = new JTextField(1);
	Field5 = new JTextField(1);
	Field6 = new JTextField(1);
	Field7 = new JTextField(1);
	Field8 = new JTextField(1);
	Field9 = new JTextField(1);
	Button = new JButton("Submit");
	
	Frame.add(Panel);
	Panel.add(Field1);
	Panel.add(Field2);
	Panel.add(Field3);
	Panel.add(Field4);
	Panel.add(Field5);
	Panel.add(Field6);
	Panel.add(Field7);
	Panel.add(Field8);
	Panel.add(Field9);
	Panel.add(Button);
	
	Frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
	Frame.setVisible(true);
	Frame.setSize(115, 170);
	
	Button.addActionListener(this);

	
}

public void actionPerformed(ActionEvent e)
{
	String s1 = Field1.getText();
	String s2 = Field2.getText();
	String s3 = Field3.getText();
	String s4 = Field4.getText();
	String s5 = Field5.getText();
	String s6 = Field6.getText();
	String s7 = Field7.getText();
	String s8 = Field8.getText();
	String s9 = Field9.getText();
	
if(e.getSource() == Button)
{
	if(s1.equals(s2)&&s2.equals(s3)||s4.equals(s5)&&s5.equals(s6)||s7.equals(s8)&&s8.equals(s9)||s1.equals(s4)&&s4.equals(s7)||s2.equals(s5)&&s5.equals(s8)||s3.equals(s6)&&s6.equals(s9)||s1.equals(s5)&&s5.equals(s9)||s3.equals(s5)&&s5.equals(s7))
	{
		JOptionPane.showMessageDialog(null, "You Win!");
	}
	else
	{
		JOptionPane.showMessageDialog(null, "Try Again");
	}
	
}
}
}