package Level_0;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class methods
{
	public static void main(String[] args)
	{
		new methods();
		}
	methods()
	{
		square(100);
		triangle(100);
		}
	void square(int side)
	{
		Tortoise.setSpeed(5);
		for (int i = 0; i < 4; i++)
		{
			Tortoise.setPenColor(Colors.getRandomColor());
			Tortoise.move(side);
			Tortoise.turn(90);
			}
		}

	void triangle(int side)
	{
		Tortoise.setSpeed(5);
		for (int i = 0; i < 3; i++)
		{
			Tortoise.setPenColor(Colors.getRandomColor());
			Tortoise.move(side);
			Tortoise.turn(120);
	}
		
		}
	}
	

