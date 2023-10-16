package cats.model;

import javax.swing.JOptionPane;

import cats.view.Popup;

public class ShelterCats
{
	public ShelterCats()
	{
		
	}
	
	public void ShelterCatsProgram()
	{
		needMoreCats();
	}
	
	private void needMoreCats()
	{
		int response;
		int catCount = 100;
		Popup popup = new Popup();
		response = popup.askYesNoQuestion("More cats?");
		
		if (response == 1) // 1 is no
		{
			JOptionPane.showMessageDialog(null, response);
		}
		else if (response == 0) // 0 is yes
		{
			catCount = Integer.parseInt(popup.askInputQuestion("How many cats?"));
		}
		else
		{
			JOptionPane.showInputDialog(null, "How did you get here?");
		}
	}
	
}
