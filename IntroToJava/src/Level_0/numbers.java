package Level_0;
import javax.swing.JOptionPane;

public class numbers
{
	public static void main(String[] args)
	{
		String x = JOptionPane.showInputDialog("Give me a number");
		String y = JOptionPane.showInputDialog("Give me another number");
		String z = JOptionPane.showInputDialog("Give me even another number");
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		int c = Integer.parseInt(z);
		
		if (a > b)
		{
			if (b > c)
			{
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
			else
			{
				System.out.println(a);
				System.out.println(c);
				System.out.println(b);
			}
		}
		else if (b > a)
		{
			if (a > c)
			{
				System.out.println(b);
				System.out.println(a);
				System.out.println(c);
			}
			else
			{
				System.out.println(b);
				System.out.println(c);
				System.out.println(a);
			}	
		}
		else if (c > a)
		{
			if (a > b)
			{
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);
			}
			else
			{
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
			}
		}
	}
}
