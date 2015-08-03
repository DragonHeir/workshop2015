// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class spiramaker {

	public static void main(String[] args) {
		
		Tortoise.setSpeed(10);
		
		int sides = 0;
		String input = JOptionPane.showInputDialog("What kind of spiral would you like to make");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		if (input.equals("Triangle"))
		{
			sides = 3;
		}
		else if (input.equals("Square"))
		{
			sides = 4;
		}
		else if (input.equals("Pentagon"))
		{
			sides = 5;
		}
		else if (input.equals("Hexagon"))
		{
			sides = 6;
		}
		else JOptionPane.showMessageDialog(null, "I do not recognize that kind of spiral, please try something a little simpler");
		
		for (int i = 0; i < 1000; i++)
			{
				Tortoise.move(1*i);
				Tortoise.turn(360/sides);
				Tortoise.setPenColor(Colors.getRandomColor());
			}
		
	}
		
		
		
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
	
		

}


