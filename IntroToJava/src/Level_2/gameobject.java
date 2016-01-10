package Level_2;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class gameobject
{
	int x;
	int y;
	int width;
	int height;
	BufferedImage image;
	Rectangle cBox;

	gameobject(int x, int y, int width, int height, String image)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		try
		{
			this.image = ImageIO.read(this.getClass().getResourceAsStream(image));
		} 
		catch (IOException e)
		{
			System.out.println("Error Loading Image");
		}
		cBox = new Rectangle(x, y, width, height);
	}
	public void paint(Graphics g)
	{
		g.drawImage(image, x, y, width, height, null);
	}
	public void refresh()
	{
		y = y + 16;
		if(y >= 480 - 16)
		{
			y = 480 - 16;
		}
		cBox.setBounds(x, y, width, height);
	}
	public Rectangle getBox()
	{
		return cBox;
	}
}