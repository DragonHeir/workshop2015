package Level_2;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener
{
	Timer blocktimer;
	gameobject bg;
	gameobject a;
	gameobject b;
	public void paint(Graphics g)
	{
		bg.paint(g);
		a.paint(g);
		b.paint(g);
	}
	public GamePanel()
	{
		bg = new gameobject(0, 0, 256, 480, "Background.png");
		a = new gameobject(block(), 0, 16, 16, "Block.png");
		b = new gameobject(block(), 0, 16, 16, "Block.png");
		blocktimer = new Timer(1000/4, this);
		blocktimer.start();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		a.refresh();
		b.refresh();
		repaint();
	}
	int block()
	{
		Random r = new Random();
		int x = r.nextInt(16) + 1;
		x = x * 16;
		return x;
	}
}
