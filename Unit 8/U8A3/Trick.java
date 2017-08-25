//
// This is the code for the Trick class which uses an ArrayList
// to determine the points of cards

import java.util.ArrayList;


public class Trick {

	private ArrayList<Card> list = new ArrayList<Card>();
	private int points;

	public Trick(ArrayList<Card> l) {

		list = l;
		setTotalPoints();
	}


	private void setTotalPoints() {

		for (int i = 0; i < list.size(); i++) {

			Card x = list.get(i);

			points += x.getPoints();
		}
	}

	public String toString() {

		String result = "The Trick:\n\n";

		for (int i = 0; i < list.size(); i++) {

			Card x = list.get(i);

			result += x.toString() + "\n";
		}

		return result;
	}

	public Card getWinner() {

		Card lead = list.get(0);

		Card result = lead;
		for (Card x : list) {


			if (x.compareTo(lead) == 1 && x.compareTo(result) == 1)
				result = x;
		}

		return result;
	}

	public int getTotal() {

		return points;
	}
}









