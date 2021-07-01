package classes;

import interfaces.IFootballFactory;
import interfaces.IPlayer;
import interfaces.ITeam;

public class SeriesAFactory implements IFootballFactory{

	@Override
	public ITeam CreateTeam() {
		
		return new Juventus();
	}

	@Override
	public IPlayer CreatePlayer() {
		
		return new SeriesAPlayer();
	}

}
