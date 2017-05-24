// Ralph Nahra
//
// This is the Pitcher class which is a sublcass of the BaseballPlayer
// superclass. It calculates the pitcher's run average based on earned runs
// and innings pitched.

public class Pitcher extends BaseballPlayer {

	private int earned_runs;
	private double innings;
	private String stat;

	public Pitcher (String n, int g, double i, int e) {

		super(n,g);
		innings = i;
		earned_runs = e;
		setStat();
	}

	public void setStat() {

		double era = (9 * earned_runs) / innings;
		stat = String.format("%.2f", era);
	}

	public String toString() {

		return super.toString() + "Earned Run Average: " + stat;
	}
}