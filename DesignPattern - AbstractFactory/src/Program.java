import classes.BundesLigaFactory;
import classes.FootballWorld;
import interfaces.IFootballFactory;

public class Program {

	public static void main(String[] args) {
		
		IFootballFactory almanya = new BundesLigaFactory();
		
		FootballWorld fworld = new FootballWorld(almanya);
		
		System.out.println(fworld.GetFootballTeamColor());
		System.out.println(fworld.GetFootballTopScorer());
				
		
	}
	
}

