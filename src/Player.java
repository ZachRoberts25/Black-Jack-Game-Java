import java.util.ArrayList;
import java.util.List;

public class Player extends PlayerDealer{
	public static List<Player> players;
	public List<Card> cardsInHand;
	
	public Player(){
		if(players == null){
			players = new ArrayList();
			}
		players.add(this);
		
	}
	
}
