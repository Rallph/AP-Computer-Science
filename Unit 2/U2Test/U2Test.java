// Ralph Nahra
//
// This is the driver class for the DataSet class

import java.util.Scanner;

public class U2Test {

	public static void main(String[] args) {

		DataSet d = new DataSet();
		DataSet d2 = new DataSet(73, 8);

		Scanner in = new Scanner(System.in);

		System.out.print("Enter Integer #1: ");
		int i1 = in.nextInt();
		d.addValue(i1);
		d2.addValue(i1);

		System.out.print("Enter Integer #2: ");
		int i2 = in.nextInt();
		d.addValue(i2);
		d2.addValue(i2);

		System.out.print("Enter Integer #3: ");
		int i3 = in.nextInt();
		d.addValue(i3);
		d2.addValue(i3);

		System.out.print("Enter Integer #4: ");
		int i4 = in.nextInt();
		d.addValue(i4);
		d2.addValue(i4);
		System.out.println();

		double a = d.average();
		double a2 = d2.average();

		System.out.printf("Default Constructor Average    = %.1f%n%n", a);
		System.out.printf("Parametric Constructor Average = %.1f%n%n", a2);

	}


}

/*

Output:

Enter Integer #1: 45
Enter Integer #2: 32
Enter Integer #3: 66
Enter Integer #4: 4

Default Constructor Average    = 36.8

Parametric Constructor Average = 18.3

Press any key to continue . . .


*/