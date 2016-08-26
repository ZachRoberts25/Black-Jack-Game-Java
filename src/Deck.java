import java.util.ArrayList;
import java.util.List;

public class Deck  {
	public List<Card> cards;
	public Deck() {
		List<Card> cards = new ArrayList<Card>(100000);
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
		for(int i = 0; i < ranks.length; i++) {
			for(String suit: suits) {
				Card card1 = new Card(ranks[i], suit);
				cards.add(card1);
			}
		}
		this.cards = cards;
		
	}
	public List<Card> cards(){
		return this.cards;
		
	}
}
