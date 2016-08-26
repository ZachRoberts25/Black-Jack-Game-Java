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
		
		for (Card card : this.cardsInHand) {
			total += card.getValue();
			
			if (total > 21) {
				for (Card card1 : this.cardsInHand) {
					if (card1.rank == "A") {
						
						this.cardsInHand.set(this.cardsInHand.indexOf(card1), new Card("A1", "Spades"));
						break;
					}
				}
						total -= total;						
						for (Card card2 : this.cardsInHand) {
							total += card2.getValue();
						}
						
					}
				}
			

		
		return total;
	}

	// this.cardsInHand

}
