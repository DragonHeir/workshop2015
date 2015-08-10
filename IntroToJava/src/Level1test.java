	/* Level 0 Exam: Coding  Exercise #1 */
	import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class Level1test
{

		public static void main(String[] args)
		{
			// 3. ask the user what color they would like the tortoise to draw
			String pencolor = JOptionPane.showInputDialog("What color would you like to draw(primary or secondary color)?");
			// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
			if (pencolor.equals("Red"))
			{
				Tortoise.setPenColor(Color.RED);
			}
			else if (pencolor.equals("Yellow"))
			{
				Tortoise.setPenColor(Color.YELLOW);
			}
			else if (pencolor.equals("Blue"))
			{
				Tortoise.setPenColor(Color.BLUE);
			}
			else if (pencolor.equals("Orange"))
			{
				Tortoise.setPenColor(Color.ORANGE);
			}
			else if (pencolor.equals("Green"))
			{
				Tortoise.setPenColor(Color.GREEN);
			}
			else if (pencolor.equals("Purple"))
			{
				Tortoise.setPenColor(Color.MAGENTA);
			}
			// 2. set the pen width to 10
				Tortoise.setPenWidth(10);
			// 1. make the tortoise draw a shape
			for (int i = 0; i < 4; i++)
			{
				Tortoise.move(100);
				Tortoise.turn(90);
			}
			
		}
	}

