package Level_0;
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class dizzytortoise {

	public static void main(String[] args) {
		//2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
		String dizzy = JOptionPane.showInputDialog("How dizzy do you want the tortoise? (1-10)");
		int spin = Integer.parseInt(dizzy);
}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}

