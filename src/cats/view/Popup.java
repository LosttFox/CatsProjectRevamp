package cats.view;

import javax.swing.JOptionPane;

public class Popup
{
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	public static int askYesNoQuestion(String question)
	{
		String[] options = {"yes", "no"};
		
		return JOptionPane.showOptionDialog(null, question, "Cats!", JOptionPane.YES_NO_OPTION, 0, null, options, options[0]);
		
		
	}
}
