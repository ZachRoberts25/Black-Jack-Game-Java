import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PlayerDealer {
	public Card firstCard;
	public Card secondCard;
	public List<Card> cardsInHand;
	private int total;

	public List<Card> getHand(Card card1, Card card2) {
		firstCard = card1;
		secondCard = card2;
		this.cardsInHand = new ArrayList<Card>();
		this.cardsInHand.add(firstCard);
		this.cardsInHand.add(secondCard);
		return this.cardsInHand;
	}

	public int getTotal() {
		return this.total;
	}

	public int calcTotal() {
		int total = 0;
		// this.cardsInHand
		Card aceSpades = new Card("A", "Spades");
		Card aceDiamonds = new Card("A", "Diamonds");
		List<Card> array = new ArrayList<Card>();
		array.add(aceSpades);
		array.add(aceDiamonds);
		for (Card card : array) {
			total += card.getValue();
			
			if (total > 21) {
				for (Card card1 : array) {
					if (card1.rank == "A") {
						
						array.set(array.indexOf(card1), new Card("A1", "Spades"));
						break;
					}
				}
						total -= total;						
						for (Card card2 : array) {
							total += card2.getValue();
						}
						
					}
				}
			

		
		return total;
	}

	// this.cardsInHand

}
