package Level_1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Photobook
{
	JFrame frame = new JFrame();
	JPanel book = new JPanel();
	JButton next = new JButton("Next");
	JButton prev = new JButton("Prev");
	JButton rand = new JButton("Rand");
	Imagepanel image1 = new Imagepanel("Image1.jpg", 300, 300);

	public static void main(String[] args)
	{
		Photobook p = new Photobook();
	}

	Photobook()
	{
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		image1.setBounds(0, 0, 300, 300);
		frame.setSize(300, 300);
		frame.add(book);
		frame.add(image1);
		book.add(next);
		book.add(prev);
		book.add(rand);

	}
}
