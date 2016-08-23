import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dealer extends PlayerDealer{
	String name;
	Deck deck;
	int total;
	public List<Card> cardsInHand; 
	
	public Dealer(){
		this.deck = new Deck();
		
	}
	public String getName(){
		return this.name;
	}
	public Deck getDeck(){
		return this.deck;
	}
	public void dealCards(){
		this.cardsInHand = new ArrayList<Card>();
		for(Player player : Player.players){
			player.cardsInHand = new ArrayList<Card>();
			player.cardsInHand = player.getHand(dealCard(), dealCard());
			
		}
		this.cardsInHand = this.getHand(dealCard(), dealCard());
		}
		public Card dealCard(){
			Random rand = new Random();
			int n = rand.nextInt(53);
				Card card = deck.cards.get(n);
				deck.cards.remove(n);				
				return card;
	}
}
