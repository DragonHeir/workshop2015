package Level_0;
import javax.swing.JOptionPane;


public class guesstheanimal
{
public static void main(String[] args)
{

	int legs = JOptionPane.showConfirmDialog(null, "Does it have four legs?", "", JOptionPane.YES_NO_OPTION);
	if (legs == JOptionPane.YES_OPTION)
	{
		int claws = JOptionPane.showConfirmDialog(null, "Does it have retractable claws?", "", JOptionPane.YES_NO_OPTION);
		if (claws == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "It is a Feline");
		}
		
		if (claws == JOptionPane.NO_OPTION)
		{
			JOptionPane.showMessageDialog(null, "It is a Canine");
		}
	}
	
	if (legs == JOptionPane.NO_OPTION)
	{

		int feathers = JOptionPane.showConfirmDialog(null, "Does it have feathers?", "", JOptionPane.YES_NO_OPTION);
		if (feathers == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "It's a Bird");
		}
		
		if (feathers == JOptionPane.NO_OPTION)
		{
			JOptionPane.showMessageDialog(null, "It's a Primate");
		}
	}
}
}

//1. ask user if it has 4 legs. if yes, it’s a pig if no, it’s a monkey 
//2. add zebra, pig, monkey, bird,
//3. add fish and spider.