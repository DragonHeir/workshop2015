package Level_2;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener
{
	Timer blocktimer;
	gameobject a;
	public void paint(Graphics g)
	{
		a.paint(g);
	}
	public GamePanel()
	{
		a = new gameobject(10, 10, 16, 16, "Block.png");
		blocktimer = new Timer(1000/1, this);
		blocktimer.start();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		a.refresh();
		repaint();
	}
}
