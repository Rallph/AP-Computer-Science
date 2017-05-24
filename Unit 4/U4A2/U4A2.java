// Ralph Nahra
//
// This will find the iterations necessary to
// find pi accurate to 5 decimal places.

public class U4A2 {

	private static final double PI = 3.14159;

	public static void main(String[] args) {

		double x = 1;
		double pi = 0;
		int e = 0;
		double result;

		do {

			e++;
			if (e % 2 != 0)
				pi += 1 / x;
			else
				pi -= 1 / x;

			x += 2;

			String a = String.format("%7.5f", pi * 4);
			result = Double.parseDouble(a);



		} while (result != PI);



		System.out.println("Value of pi = " + result + "\n");
		System.out.println("Number of elements of the series = " + e + "\n");

	}
}