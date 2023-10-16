package cats.model;

import javax.swing.JOptionPane;

import cats.view.Popup;

public class ShelterCats
{
	Popup popup;
	
	public ShelterCats()
	{
		Popup popup = new Popup();
	}
	
	public void ShelterCatsProgram()
	{
		needMoreCats();
	}
	
	private void needMoreCats()
	{
		int response;
		
		response = popup.askYesNoQuestion("More cats?");
		
		if (response == 1) // 1 is no
		{
			JOptionPane.showMessageDialog(null, response);
		}
		else if (response == 0) // 0 is yes
		{
			howManyMoreCats();
		}
		else
		{
			JOptionPane.showInputDialog(null, "How did you get here?");
		}
	}
	
	private int howManyMoreCats()
	{
		int catCount = 100;
		String response = popup.askInputQuestion("How many cats?");
		
		
		catCount = Integer.parseInt(response);
		
		return catCount;
	}
}
