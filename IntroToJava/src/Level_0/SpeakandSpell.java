package Level_0;
import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakandSpell {

	public static void main(String[] args) {
speak ("spell mandlebrot");
String input = JOptionPane.showInputDialog("Spell Plz:");
if (input.equals("mandlebrot"))
{
speak ("Correct!");	
}
else
{
speak ("Incorrect!");
}
speak ("spell ambidextrous ");
String input2 = JOptionPane.showInputDialog("Spell Plz:");
if (input2.equals("ambidextrous"))
{
speak ("Correct!");	
}
else
{
speak ("Incorrect!");
}
speak ("spell czechoslovakia");
String input3 = JOptionPane.showInputDialog("Spell Plz:");
if (input3.equals("czechoslovakia"))
{
speak ("Correct!");	
}
else
{
speak ("Incorrect!");
}

		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

