package cats.model;

import javax.swing.JOptionPane;

import cats.view.Popup;

public class ShelterCats
{
	Popup view;
	
	public ShelterCats()
	{
		this.view = new Popup();
	}
	
	public void ShelterCatsProgram()
	{
		callShelterCats();
	}
	
	private void callShelterCats()
	{
		needMoreCats();
	}
	
	private void needMoreCats()
	{
		int response;
		
		response = view.askYesNoQuestion("More cats?");
		
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
		String response = view.askInputQuestion("How many cats?");
		
		
		catCount = Integer.parseInt(response);
		
		return catCount;
	}
}
