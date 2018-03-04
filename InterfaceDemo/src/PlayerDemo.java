
public class PlayerDemo {

	public static void main(String[] args) {

		
		Player1 player1 = new Player1("First1", "Last1", "first1last1@domain.com");
		Player2 player2 = new Player2("First2", "Last2", "first2last2@domain.com");
		
		player1.bat();
		player1.strikeBall();
		
		player2.strikeBall();
		
		System.out.println(player1 instanceof CanPlayCricket);
		
		Player[] players = {player1, player2};
		
		int playersCanPlayCricket = 0;
		int playersCanPlayTennis = 0;
		
		for (int index = 0; index < players.length; index++)
		{
			if (players[index] instanceof CanPlayCricket) {
				playersCanPlayCricket++;
			}
			
			if (players[index] instanceof CanPlayTennis) {
				playersCanPlayTennis++;
			}
		}
		
		System.out.println("Cricket Players = " + playersCanPlayCricket);
		System.out.println("Tennis Players = " + playersCanPlayTennis);
		
		//variables declared in interface are always constants
		//CanPlayTennis.x = 20;
		
		System.out.println(CanPlayTennis.x);
		System.out.println(player2.x);
		
		

	}

}
