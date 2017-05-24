// Ralph Nahra
// 
// This is the code for the Product class

public class Product {

	private String name;
	private double price;

	public Product(String n, double p) {

		name = n;
		price = p;
	}

	public void discount(int percent) {

		double percentage = (double)percent / 100;

		price = price - (price * percentage);
	}

	public void dollarsOff(int dollars) {

		double off = (double)dollars;
		price = price - off;
	}

	public void tax() {

		final double TAX_RATE = 0.065;
		price = price + (price * TAX_RATE);
	}

	public String getName() {

		return name;
	}

	public double getPrice() {

		return price;
	}
}