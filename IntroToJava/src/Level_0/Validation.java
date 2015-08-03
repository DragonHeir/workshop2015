package Level_0;
import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		int randomNumber = new Random().nextInt(5);
		// 2. On paper, write all the numbers that get printed when you run this class
		System.out.println(randomNumber);

		// 3. Use the randomNumber to give the user a random compliment.
		if (randomNumber == 0)
		{
			JOptionPane.showMessageDialog(null, "A 3rd tier cable network would totally create a television show about you.");
		}
		if (randomNumber == 1)
		{
			JOptionPane.showMessageDialog(null, "Your ex thought about you this morning, then they thought about donuts.");
		}
		if (randomNumber == 2)
		{
			JOptionPane.showMessageDialog(null, "80% of motorcycle gangs think you’d be a delightful sidecar.");
		}
		if (randomNumber == 3)
		{
			JOptionPane.showMessageDialog(null, "Cops admire your ability to stay a perfect 3-5 miles above the speed limit.");
		}
		if (randomNumber == 4)
		{
			JOptionPane.showMessageDialog(null, "Strangers all wanna sit next to you on the bus.");
		}
		if (randomNumber == 5)
		{
			JOptionPane.showMessageDialog(null, "Everyone at sleepovers thought you were the bravest during thunderstorms.");
		}
		if (randomNumber == 6)
		{
			JOptionPane.showMessageDialog(null, "You are someone's 'the one that got away'");
		}
		if (randomNumber == 7)
		{
			JOptionPane.showMessageDialog(null, "Some dudes hope you start a band so they can start a cover band of that band.");
		}
		if (randomNumber == 8)
		{
			JOptionPane.showMessageDialog(null, "Callers are intimidated by how funny your voicemail greeting is.");
		}
		if (randomNumber == 9)
		{
			JOptionPane.showMessageDialog(null, "Your principal would call you to the office just to look cool.");
		}
		
		// 5. Find someone to test out your program. They will like it :)
	}
}
