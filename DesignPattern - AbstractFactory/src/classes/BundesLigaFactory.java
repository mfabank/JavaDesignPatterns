package classes;

import interfaces.IFootballFactory;
import interfaces.IPlayer;
import interfaces.ITeam;

public class BundesLigaFactory implements IFootballFactory{

	@Override
	public ITeam CreateTeam() {
			
		return new BorissiaDortmund();
	}

	@Override
	public IPlayer CreatePlayer() {
		
		return new BundesLigaPlayer();
	}

}



