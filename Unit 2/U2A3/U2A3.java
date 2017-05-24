// Ralph Nahra
//
// This is the driver class for the TimeInterval class

import java.util.Scanner;

public class U2A3 {

	public static void main (String[] args) {

		int startTime,endTime;
		double payRate;

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the starting time: ");
		startTime = input.nextInt();
		System.out.print("Please enter the finishing time: ");
		endTime = input.nextInt();
		System.out.print("Please enter the rate of pay: ");
		payRate = input.nextDouble();

		TimeInterval t = new TimeInterval(startTime, endTime, payRate);

		int hrs = t.getHours();
		int mins = t.getMinutes();
		double pay = t.getPay();


		System.out.printf("\nTime on Task = %d hours %d minutes %n%n", hrs, mins);
		System.out.printf("Pay = $%.2f%n", pay);
	}
}


/*

Output:

Please enter the starting time: 0930
Please enter the finishing time: 1700
Please enter the rate of pay: 12.75

Time on Task = 7 hours 30 minutes

Pay = $95.63
Press any key to continue . . .

*/