import java.net.URI;

import javax.swing.JOptionPane;

public class Soundtrack_to_life {

	public static void main(String[] args) {

		int userMood = JOptionPane.showOptionDialog(null, "What mood are you in right now?", "Mood", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy", "Depressed", "Angry" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
		JOptionPane.showMessageDialog(null, userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
		if (userMood == 0)
		{
		playVideo("https://www.youtube.com/watch?v=y6Sxv-sUYtM");
		}
		if (userMood == 1)
		{
		playVideo("https://www.youtube.com/watch?v=UZ3AbQbWl0I");
		}
		if (userMood == 2)
		{
		playVideo("https://www.youtube.com/watch?v=1fu3Q1giB94");
		}


	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

