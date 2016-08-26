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
	public void hit(Dealer dealer){
		this.cardsInHand.add(dealer.dealCard());
		this.calcTotal();
	}
	public String determineWin(Dealer dealer){
		String win = "";
//		System.out.println(this.calcTotal());
//		System.out.println(dealer.calcTotal());
		if(dealer.calcTotal() == this.calcTotal()){ 
			 win = "tie";
		}else if((this.calcTotal() > 21)){
			win = "false";
		}else if((dealer.calcTotal() > 21) || this.calcTotal() > dealer.calcTotal()){
			win = "true";
		}else if((dealer.calcTotal() > this.calcTotal())){
			win = "false";
		}
		else{
			win = "error";
		}
			
		return win;
	}
	
}
