//
// This is the driver class for the cashier class

import java.util.Scanner;

public class U2A2 {

	public static void main (String[] args) {

		Scanner mrscan = new Scanner(System.in);
		double due, received;
		System.out.print("Enter the amount due: ");
		due = mrscan.nextDouble();
		System.out.print("Enter the amount received: ");
		received = mrscan.nextDouble();
		System.out.println();

		Cashier c = new Cashier(due, received);

		System.out.println("Dollars  = " + c.getDollars());
		System.out.println("Quarters = " + c.getQuarters());
		System.out.println("Dimes    = " + c.getDimes());
		System.out.println("Nickels  = " + c.getNickels());
		System.out.println("Pennies  = " + c.getPennies());
	}
}


/*

Output:

Enter the amount due: 41.35
Enter the amount received: 50.00

Dollars  = 8
Quarters = 2
Dimes    = 1
Nickels  = 1
Pennies  = 0
Press any key to continue . . .

*/








