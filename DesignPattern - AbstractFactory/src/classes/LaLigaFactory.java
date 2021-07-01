package classes;

import interfaces.IFootballFactory;
import interfaces.IPlayer;
import interfaces.ITeam;

public class LaLigaFactory implements IFootballFactory{

	@Override
	public ITeam CreateTeam() {
		
		return new RealMadrid();
	}

	@Override
	public IPlayer CreatePlayer() {
		
		return new LaLigaPlayer();
	}

}





