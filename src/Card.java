
public class Card {
	public String rank;
	private String suit;
	public int value;

	public Card(String rank, String suit) {
		this.rank = rank;
		this.suit = suit;
		this.value = getValue();
	}

	public String getRank() {
		return this.rank;

	}

	public String getSuit() {
		return this.suit;
	}

	public int getValue() {

		if (this.rank == "A") {
			value = 11;
		} else if (this.rank == "K" || this.rank == "Q" || this.rank == "J" || this.rank == "10") {
			value = 10;
		} else if(this.rank == "A1"){
			value = 1;
		}
		else {
			int rank = Integer.parseInt(this.rank);
			for (int i = 2; i < 10; i++) {
				if (rank == i){
					value = i;
					break;
				}
			}
		}
		return value;

	}
}

