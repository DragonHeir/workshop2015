package Level_0;
import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class christmastree
{

	public static void main(String[] args)
	{
		christmastree ohChristmasTree = new christmastree();
		ohChristmasTree.drawStar();
		ohChristmasTree.drawTreeBody();
		ohChristmasTree.drawTreeTrunk();
	}

	double treeWidth = 15;
	double scale = 1.1;

	void drawTreeBody()
	{
		Tortoise.setSpeed(10);
		Tortoise.setPenColor(Color.GREEN);
		int turnAmount = 175;
		Tortoise.setAngle(90);

		for (int i = 0; i < 11; i++)
		{
			Tortoise.move(100);
			Tortoise.turn(turnAmount);
			treeWidth = treeWidth * scale;
			Tortoise.move(100);
			Tortoise.turn(-175);
			treeWidth = 175 * scale;
			turnAmount = turnAmount - 1;
		}

	}

	void drawTreeTrunk()
	{
Tortoise.move(50);
Tortoise.setAngle(180);
Tortoise.setPenWidth(10);
Tortoise.setPenColor(Color.DARK_GRAY);
Tortoise.move(25);
	}

	void drawStar()
	{
		// * Optional: Draw a red star on top of the tree. Hint: 144 degrees
		// makes a star.

	}

}
