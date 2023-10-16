package cats.controller;

import cats.model.ShelterCats;

public class Controller
{
	ShelterCats cats;
	
	public Controller()
	{
		this.cats = new ShelterCats();
	}
	
	public void start()
	{
		cats.ShelterCatsProgram();
	}
}
