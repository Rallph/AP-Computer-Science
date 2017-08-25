//
// This is the driver class for the Product class

public class U2A1 {

	public static void main(String[] args) {

		Product a = new Product("Jeans", 34.95);
		Product b = new Product("Sweater", 49.99);
		Product c = new Product("Shoes", 99.95);

		a.discount(30);
		b.discount(40);
		b.discount(30);
		c.dollarsOff(5);
		c.discount(30);

		String an = a.getName();
		a.tax();
		double ap = a.getPrice();

		String bn = b.getName();
		b.tax();
		double bp = b.getPrice();

		String cn = c.getName();
		c.tax();
		double cp = c.getPrice();

		System.out.printf("Item: %s%nCost: $ %.2f%n%n", an, ap);
		System.out.printf("Item: %s%nCost: $ %.2f%n%n", bn, bp);
		System.out.printf("Item: %s%nCost: $ %.2f%n%n", cn, cp);
	}
}

/*

Output:

Item: Jeans
Cost: $ 26.06

Item: Sweater
Cost: $ 22.36

Item: Shoes
Cost: $ 70.79

Press any key to continue . . .

*/








