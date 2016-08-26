import java.util.ArrayList;
import java.util.List;

public class World {
	public static int ties;
	public static int wins;
	public static int losses;
	public static int errors;
	public static int games;

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++){
		World world = new World();
		Player player1 = new Player();
		Dealer dealer = new Dealer();
		dealer.dealCards();
		world.hitOrStay(dealer);
		world.dealerHit(dealer);
		world.determineWinners(dealer);
		}
		 System.out.println("ties " + World.ties);
		 System.out.println("wins " + World.wins);
		 System.out.println("losses " + World.losses);
		 System.out.println("errors " + World.errors);
		 System.out.println("games" + World.games);

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

	public void determineWinners(Dealer dealer) {
		for (Player player : Player.players) {
			String outcome = player.determineWin(dealer);
			switch (outcome) {
			case "tie":
				World.ties += 1;
				break;
			case "error":
				World.errors += 1;
				break;
			case "true":
				World.wins += 1;
				break;
			case "false":
				World.losses += 1;
				break;
			}

		}
		games += 1;

	}
}