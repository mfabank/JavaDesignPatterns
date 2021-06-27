package classes;

import interfaces.IFootballFactory;
import interfaces.IPlayer;
import interfaces.ITeam;

public class FootballWorld {
	private ITeam _team;
	private IPlayer _player;
	
	public FootballWorld(IFootballFactory factory) {
		_team = factory.CreateTeam();
		_player = factory.CreatePlayer();
	}
	
	public String GetFootballTeamColor() {
		
		return  _team.GetTeamColor();
		
	}
	public String GetFootballTopScorer() {
		
		return _player.GetTopScorer();
		
	}
	
}




