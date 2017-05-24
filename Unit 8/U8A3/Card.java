// Ralph Nahra
//
// This is the Card class and it implements the comparable interface,
// determines the point value, and is to be used in the game Hearts

public class Card implements Comparable {

	private String suit;
	private int value;
	private int points;

	public Card(String s, int v) {

		suit = s;
		value = v;
		setPoints();
	}

	private void setPoints() {

		if (suit.equals("Hearts"))
			points = 1;
		else if (suit.equals("Spades") && value == 12)
			points = 13;
	}

	public String toString() {

		String val;

		switch(value) {

			case 11:
				val = "Jack";
				break;
			case 12:
				val = "Queen";
				break;
			case 13:
				val = "King";
				break;
			case 14:
				val = "Ace";
				break;
			default:
				val = value + "";
				break;
		}

		return val + " of " + suit;
	}


	public int compareTo(Object obj) {

		Card card = (Card)obj;

		if (!this.getSuit().equals(card.getSuit()))
			return -1;
		else {

			if (this.getValue() > card.getValue())
				return 1;
			else if (this.getValue() < card.getValue())
				return -1;
			else
				return 0;
		}

	}

	public String getSuit() {

		return suit;
	}

	public int getValue() {

		return value;
	}

	public int getPoints() {

		return points;
	}
}
