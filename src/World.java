import java.util.ArrayList;
import java.util.List;

public class World {
	public static double ties;
	public static double wins;
	public static double losses;
	public static double errors;
	public static double games;

	public static void main(String[] args) {
		for(int i = 0; i < 1000; i++){
		World world = new World();
		Player player1 = new Player();
		Dealer dealer = new Dealer();
		dealer.dealCards();
		world.hitOrStay(dealer);
		world.dealerHit(dealer);
		world.determineWinners(dealer, player1);
		}
		 System.out.println("ties percantage: " + (World.ties/World.games) * 100);
		 System.out.println("wins percentage: " + (World.wins/World.games) * 100);
		 System.out.println("losses percentage: " + (World.losses/World.games) * 100);
		 System.out.println("errors " + World.errors);
		 System.out.println("games " + World.games);

	}

	public void hitOrStay(Dealer dealer) {
		for (Player player : Player.players) {
			player.calcTotal();
			if (player.calcTotal() < 11) {
				player.hit(dealer);
			} else if ((player.calcTotal() > 10 && player.calcTotal() < 17)
					&& (dealer.firstCard.getValue() < 7 && dealer.firstCard.getValue() > 1)) {
				player.hit(dealer);
			} else {
				break;
			}

		}
	}

	public void dealerHit(Dealer dealer) {
//		System.out.println(dealer.calcTotal());
		if (dealer.calcTotal() < 17) {
			do {
				dealer.hit();
			} while (dealer.calcTotal() < 17);
		}
	}

	public void determineWinners(Dealer dealer, Player player) {
//		for (Player player : Player.players) {
			String outcome = player.determineWin(dealer);
			switch (outcome) {
			case "tie":
				World.ties++;
				break;
			case "error":
				World.errors++;
				break;
			case "true":
				World.wins++;
				break;
			case "false":
				World.losses++;
				break;
			}

//		}
		World.games++;

	}
}