package Level_2;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class gameobject
{
	int x;
	int y;
	int width;
	int height;
	BufferedImage image;

	gameobject(int x, int y, int width, int height, String image)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		try
		{
			this.image = ImageIO.read(this.getClass().getResourceAsStream(image));
		} catch (IOException e)
		{
			System.out.println("Error Loading Image");
		}
	}
	public void paint(Graphics g)
	{
		g.drawImage(image, x, y, width, height, null);
	}
}