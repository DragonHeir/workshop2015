package Level_2;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BE_Main
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
		Frame.add(new GamePanel());
		Frame.setSize(256,502);
	}
}
