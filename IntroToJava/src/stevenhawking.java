import java.io.IOException;

import javax.swing.JOptionPane;

public class stevenhawking {

	public static void main(String[] args)
	{
String Message = JOptionPane.showInputDialog("Input");
	for (int i = 0; i < 1; i++)
	{
		speak(Message);
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

// Copyright Wintriss Technical Schools 2014







 