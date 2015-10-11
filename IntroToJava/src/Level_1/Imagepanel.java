package Level_1;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Imagepanel extends JPanel
{
	int w;
	int h;

	BufferedImage image;

	Imagepanel(String filename, int w, int h)
	{
		try
		{
			image = ImageIO.read(this.getClass().getResourceAsStream(filename));
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		this.w = w;
		this.h = h;

	}

	public void paint(Graphics g)
	{
		g.drawImage(image, 0, 0, w, h, null);
	}
}