package Level_1;

import org.jointheleague.graphical.robot.Robot;

public class face
{
	public static void main(String[] args)
	{
		face a = new face();
	}

	face()
	{
		Robot a = new Robot();
		a.setSpeed(10);
		a.penDown();
		eyes(a);
		nose(a);
		mouth(a);
		a.hide();
	}

	void eyes(Robot a)
	{
		for (int i = 0; i < 360; i++)
		{
			a.move(1);
			a.turn(1);
		}
		a.turn(-80);
		for (int i = 0; i < 60; i++)
		{
			a.move(1);
			a.turn(-1);
		}
		a.turn(80);
		for (int i = 0; i < 360; i++)
		{
			a.move(1);
			a.turn(-1);
		}
	}

	void nose(Robot a)
	{
		a.turn(100);
		for (int i = 0; i < 30; i++)
		{
			a.move(1);
			a.turn(1);
		}
		a.turn(85);
		a.move(75);
		a.turn(30);
		a.move(100);
		a.turn(-120);
		a.move(100);
		a.turn(-120);
		a.move(100);
		a.turn(-150);
	}

	void mouth(Robot a)
	{
		a.move(200);
		a.turn(90);
		for (int i = 0; i < 50; i++)
		{
			a.move(1);
			a.turn(1);
		}
		a.move(75);
		a.turn(180);
		a.move(75);
		for (int i = 0; i < 100; i++)
		{
			a.move(1);
			a.turn(-1);
		}
		a.move(75);
	}
}
