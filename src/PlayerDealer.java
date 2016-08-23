import java.util.ArrayList;
import java.util.List;

public class PlayerDealer {
	public Card firstCard;
	public Card secondCard;
	public List<Card> cardsInHand;
	private int total;
	public List<Card> getHand(Card card1, Card card2){
		firstCard = card1;
		secondCard = card2;
		this.cardsInHand = new ArrayList<Card>();
		this.cardsInHand.add(firstCard);
		this.cardsInHand.add(secondCard);
		return this.cardsInHand;
	}
	public void calcTotal(){
		int total = 0;
		
	}
	public int getTotal(){
		return this.total;
	}
	
}
