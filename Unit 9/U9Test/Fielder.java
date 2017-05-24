// Ralph Nahra
//
// This is the code for the Fielder class which is a
// subclass of the BaseballPlayer superclass.
// The fielder has a fielding percentage which
// is calculated using assists, putouts, and errors.

public class Fielder extends BaseballPlayer {

	private int assists, putouts, errors;
	private String stat;

	public Fielder(String n, int g, int a, int p, int e) {

		super(n,g);
		assists = a;
		putouts = p;
		errors = e;
		setStat();
	}

	public void setStat() {

		double fp = (double)(assists + putouts) / (assists + putouts + errors);
		stat = String.format("%.3f", fp);
	}

	public String toString() {

		return super.toString() + "Fielding Percentage: " + stat;
	}
}