// Ralph Nahra
//
// This class is for the Dice object which
// adds up the sum of two dice

public class Dice implements Measurable {


	private int die1, die2;
	private String sum;

	public Dice(int d1, int d2) {

		die1 = d1;
		die2 = d2;
		setSum();
	}

	private void setSum() {

		sum = (die1 + die2) + "";
	}

	public String getResult() {

		return sum;
	}
}