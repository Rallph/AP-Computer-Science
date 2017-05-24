// Ralph Nahra
//
// This is the superclass which will be used by the
// Pitcher, Hitter, and Fielder classes. The classes will
// calculate batting average, earned run average, and fielding
// percentage.

public abstract class BaseballPlayer {

	private String name;
	private int games;

	public BaseballPlayer(String n, int g) {

		name = n;
		games = g;

	}

	public String toString() {

		return "Name: " + name + "\nGames: " + games + "\n";
	}

	public abstract void setStat();

}

