package Level_1;

import javax.swing.JOptionPane;

public class methodpractice
{
	public static void main(String[] args)
	{
		methodpractice p = new methodpractice();
	}

	methodpractice()
	{
		System.out.println(add10(9));
		exclamation("Hello World");
		color();
		System.out.println(threeint(9, 10, 2));
		System.out.println(intminusfloat(13, 11.4f));
		repeatname("Evan Wright");
		comparator(3, "Evan");
	}

	int add10(int a)
	{
		return a + 10;
	}

	void exclamation(String b)
	{
		System.out.println(b + "!");
	}

	void color()
	{
		String a = JOptionPane.showInputDialog("Favorite Color?");
		System.out.println(a);
	}

	int threeint(int c, int d, int e)
	{
		return c + d + e;
	}

	float intminusfloat(int f, float g)
	{
		return g - f;
	}

	void repeatname(String h)
	{
		for (int i = 0; i < 25; i++)
		{
			System.out.println(h);
		}
	}

	void comparator(int i, String j)
	{
		if (i < j.length())
		{
			System.out.println(j);
		} else
		{
			System.out.println("Too Low");
		}
	}
}
