package cats.model;

import javax.swing.JOptionPane;

import cats.view.Popup;

public class ShelterCats
{
	private static int response;
	
	public ShelterCats()
	{
		
	}
	
	public static void needMoreCats()
	{
		response = Popup.askYesNoQuestion("More cats?");
		
		
		if (response == 1) // 1 is no
		{
			JOptionPane.showMessageDialog(null, response);
		}
		else if (response == 0) // 0 is yes
		{
			JOptionPane.showMessageDialog(null, response);
		}
		else
		{
			JOptionPane.showInputDialog(null, "How did you get here?");
		}
	}
}
