import java.util.ArrayList;
import java.util.List;

public class World {

	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		Dealer dealer = new Dealer();
		dealer.dealCards();
//		System.out.println();
//		for(Player player : Player.players){
//			System.out.println(player.cardsInHand);	
//		}
//		
//		System.out.println(dealer.cardsInHand);
		System.out.println(player2.calcTotal());
	}

}
