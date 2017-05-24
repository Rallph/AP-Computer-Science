// Ralph Nahra
//
// lol


public class StockItem {

	private String name;
	private int idnum;
	private double price;
	private int numOnShelf;

	public StockItem(String n, int id, double p, int num) {

		name = n;
		idnum = id;
		price = p;
		numOnShelf = num;
	}

	public String getName() {

		return name;
	}

	public int getID() {

		return idnum;
	}

	public double getPrice() {

		return price;
	}

	public int getNum() {

		return numOnShelf;
	}

	//This method changes the price of an item
	public void setPrice(double p) {

		price = p;
	}

	//This method removes n items from the number already on shelf.
	//If an attempt is made to remove more than the number on the shelf,
	//all are removed.
	public void remove(int n) {

		numOnShelf -= n;

		if (numOnShelf < 0) numOnShelf = 0;
	}

	//This method adds n items to the number already on the shelf.
	public void add(int n) {

		numOnShelf += n;
	}

	public String toString() {

		if(name.length() >= 8)
			return (idnum + "\t" + name + "\t$" + price + "\t" + numOnShelf);
		else
			return (idnum + "\t" + name + "\t\t$" + price + "\t" + numOnShelf);
	}
}