package Level_2;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BE_Main extends JPanel
{
	JFrame Frame;
	gameobject entity;
	public static void main(String[] args)
	{
		BE_Main m = new BE_Main();
	}
	BE_Main()
	{
		Frame = new JFrame("Block Escape");
		Frame.setVisible(true);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		entity = new gameobject(10, 10, 100, 100, "imgres.jpg");
		Frame.add(this);
		Frame.setSize(300,500);
	}
	public void paint(Graphics g)
	{
		entity.paint(g);
	}
}
