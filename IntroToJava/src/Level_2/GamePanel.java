package Level_2;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener
{
	boolean isFalling = true;
	int x = 5;
	int blockcounter = 0;
	Timer blocktimer;
	gameobject bg;
	ArrayList<gameobject> blocks;
	public void paint(Graphics g)
	{
		bg.paint(g);
		for (gameobject block:blocks)
		{
			block.paint(g);
		}
	}
	public GamePanel()
	{
		bg = new gameobject(0, 0, 256, 480, "Background.png");
		blocks = new ArrayList<gameobject>();
		blocktimer = new Timer(1000/6, this);
		blocktimer.start();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		for (gameobject block:blocks)
		{
			block.refresh();

		}
		repaint();
		blockLogic();
		checkCollision();
	}
	int block()
	{
		Random r = new Random();
		int x = r.nextInt(16);
		x = x * 16;
		return x;
	}
	public void addBlock()
	{
		blocks.add(new gameobject(block(), 0, 16, 16, "block.png"));
	}
	public void blockLogic()
	{
		if (blockcounter == 5)
		{
			addBlock();
			blockcounter = 0;
		}
		blockcounter++;
	}
	boolean isFalling()
	{
		return true;
	}
	public void checkCollision()
	{
		for (int i = 0; i < blocks.size(); i++)
		{
			for (int j = 0; j < blocks.size(); j++)
			{
				if (i == j)
				{
					continue;
				}
				Rectangle r1 = blocks.get(i).getBox();
				Rectangle r2 = blocks.get(j).getBox();
				if (r1.intersects(r2) && blocks.get(j).getisFalling())
				{
					gameobject go = blocks.get(j);
					go.setIsFalling(false);
					blocks.get(i).setIsFalling(false);
					go.setY(go.getY()-32);
				}
			}
		}
	}
}
