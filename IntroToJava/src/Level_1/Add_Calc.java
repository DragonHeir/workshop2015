package Level_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Add_Calc implements ActionListener
{
	
	JFrame Window;
	JPanel Panel;
	JTextField Field1;
	JTextField Field2;
	JButton Button;
	
public static void main(String[] args)
{
	Add_Calc g = new Add_Calc();
}
public Add_Calc()
{
	Window = new JFrame();
	Panel = new JPanel();
	Field1 = new JTextField(10);
	Field2 = new JTextField(10);
	Button = new JButton("Add");
	Window.setVisible(true);
	Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Window.add(Panel);
	Panel.add(Field1);
	Panel.add(Field2);
	Panel.add(Button);
	Window.pack();
	
	
}
public void actionPerformed(ActionEvent e)
{
	if
	
}
}


