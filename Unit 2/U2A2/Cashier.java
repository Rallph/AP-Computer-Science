// Ralph Nahra
//
// This is the cashier class for U2A2 which calculates
// The number of coins needed for change


public class Cashier {

	private int dollars, quarters, dimes, nickels, pennies;
	


	public Cashier(double due, double received) {

		int change = ((int)(received*100)) - ((int)(due*100));
		dollars = change / 100;
		change = change - dollars * 100;
		quarters = change / 25;
		change = change - quarters * 25;
		dimes = change / 10;
		change = change - dimes * 10;
		nickels = change / 5;
		change = change - nickels * 5;
		pennies = change;
	}

	public int getDollars() {

		return dollars;
	}

	public int getQuarters() {

		return quarters;
	}

	public int getDimes() {

		return dimes;
	}

	public int getNickels() {

		return nickels;
	}

	public int getPennies() {

		return pennies;
	}


}