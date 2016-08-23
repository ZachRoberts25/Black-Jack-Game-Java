
public class Card {
	private String rank;
	private String suit;
	private int value;

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
		} else {
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

