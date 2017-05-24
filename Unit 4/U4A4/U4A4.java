// Ralph Nahra
//
// This will find the amount of time required to pay off debt

import java.util.Scanner;

public class U4A4 {

	private double apr;
	private double min;
	private int count = 0;
	private double accum = 0;

	public static void main(String[] args) {

		U4A4 x = new U4A4();
	}

	public U4A4() {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter credit card balance: ");
		double bal = in.nextDouble();

		System.out.print("\nEnter minimum monthly payment (as a % of the balance): ");
		min = in.nextDouble() / 100.0;
		System.out.print("\nEnter annual percentage rate: ");
		apr = in.nextDouble() / 100.0;
		int months = getMonths(bal);
		double profit = accum - bal;
		System.out.print("\n\nNumber of months to pay off debt: " + months + "\n");
		System.out.printf("\nProfit for the credit card company = $%.2f\n\n", profit);
	}

	public int getMonths(double bal) {

		double payment = bal * min;
		count++;
		double nBal;

		if (payment < 20 && bal >= 20) {

			nBal = bal * (1 + apr/12) - 20;
			accum += 20;

		} else if (payment < 20 && bal < 20) {

			nBal = 0;
			accum += bal;
		} else {

			nBal = bal * (1 + apr/12) - payment;
			accum += payment;
		}

		if (nBal == 0)
			return count;
		else
			return getMonths(nBal);

	}


}