package Level_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui_intro implements ActionListener
{
	// Panels go into the Frames
	JFrame Frame1;
	JPanel Panel1;
	JButton Button1;
	JTextField jtf;

	public static void main(String[] args)
	{
		Gui_intro g = new Gui_intro();
	}

	public Gui_intro()
	{
		jtf = new JTextField(10);
		// Window setup code
		Frame1 = new JFrame();
		Frame1.setVisible(true);
		Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame1.setSize(300, 200);

		// This section links the button to the panel, and the panel to the
		// frame
		Panel1 = new JPanel();
		Button1 = new JButton("useless button");
		Panel1.add(Button1);
		Panel1.add(jtf);
		Frame1.add(Panel1);
		Button1.addActionListener(this);

		Frame1.pack();
	}

	// to make the button do something
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == Button1)
		{
			System.out.println("keep clicking, maybe something will happen");
		}

	}

}
