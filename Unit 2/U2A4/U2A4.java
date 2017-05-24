// Ralph Nahra
//
// This is the driver class for the EasterSunday class

import java.util.Scanner;
import java.io.*;

public class U2A4 {

	public static void main(String[] args) {

		U2A4 app = new U2A4();
		U2A4 app2 = new U2A4();

	}

	public U2A4 () {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = in.nextInt();

		EasterSunday es = new EasterSunday(year);
		int mon = es.getMonth();
		int day = es.getDay();
		String nme = getMonthName(mon);

		System.out.printf("Easter Sunday is on %s %d%n%n", nme, day);

	}

	public String getMonthName(int mon) {

		Scanner in;

		try {

			in = new Scanner(new File("U:\\STUDENT\\PROJECTS\\West Projects\\Computer Science\\JavaData\\U2A4.txt"));
		}
		catch (IOException e) {

			throw new RuntimeException (e.toString());
		}

		String inputLine = in.nextLine();
		String myString = inputLine.substring(((mon - 1) * 9), (mon * 9));
		return myString;
	}

}

/*

Output:

Enter the year: 2016
Easter Sunday is on March     27

Enter the year: 2017
Easter Sunday is on April     16

Press any key to continue . . .

*/
