//YAY I FINISHED!!!

package Level_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class slotmachine implements ActionListener
{
	JFrame Frame;
	JPanel Panel;
	JLabel Bet;
	JTextField BetField;
	JLabel Total;
	JLabel Totalnum;
	JButton Spin;
	JLabel num1;
	JLabel num2;
	JLabel num3;

	public static void main(String[] args)
	{
		slotmachine r = new slotmachine();
	}

	slotmachine()
	{
		Frame = new JFrame("Slot Machine");
		Panel = new JPanel();
		Bet = new JLabel("Bet = ");
		BetField = new JTextField(5);
		Total = new JLabel("Total $ =");
		Totalnum = new JLabel("1000");
		Spin = new JButton("Spin");
		num1 = new JLabel("0");
		num2 = new JLabel("0");
		num3 = new JLabel("0");

		Frame.add(Panel);
		Frame.setVisible(true);
		Frame.setSize(500, 600);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel.add(Bet);
		Panel.add(BetField);
		Panel.add(Total);
		Panel.add(Totalnum);
		Panel.add(Spin);
		Panel.add(num1);
		Panel.add(num2);
		Panel.add(num3);
		Spin.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String v = BetField.getText();
		int w = Integer.parseInt(v);

		String x = Totalnum.getText();
		int y = Integer.parseInt(x);
		if (w < y)
		{
			Random n1 = new Random();
			Random n2 = new Random();
			Random n3 = new Random();

			int number1 = n1.nextInt(4);
			int number2 = n2.nextInt(4);
			int number3 = n3.nextInt(4);

			num1.setText("" + number1);
			num2.setText("" + number2);
			num3.setText("" + number3);

			String a = num1.getText();
			int b = Integer.parseInt(a);

			String c = num2.getText();
			int d = Integer.parseInt(c);

			String g = num3.getText();
			int f = Integer.parseInt(g);

			if (b == d && d == f)
			{
				y += w;
				Totalnum.setText("" + y);
			} else
			{
				y -= w;
				Totalnum.setText("" + y);
			}

		}

		else
		{
			JOptionPane.showMessageDialog(Bet, "Your bet exceeds your money");
		}
	}

}
