//
// This class is the Hitter class and it is a subclass
// of the BaseballPlayer class. This class will find the
// batting average of the baseball player.

public class Hitter extends BaseballPlayer {

	private int at_bats, hits;
	private String stat;

	public Hitter(String n, int g, int b, int h) {

		super(n,g);
		at_bats = b;
		hits = h;
		setStat();
	}

	public void setStat() {

		double ave = (double)hits / at_bats;
		stat = String.format("%.3f", ave);
	}

	public String toString() {

		return super.toString() + "Batting Average: " + stat;
	}
}








