//
// This code is the code for a score object
// which will be used in the top 10 score list.
// Score objects will consists of a ranking, name,
// and score in the mastermind game.

public class Score {

	private int rank = 0;
	private int score;
	private String name;

	public Score(String n, int s) {

		name = n;
		score = s;
	}

	public String toString() {

		return rank + "\t" + score + "\t" + name;
	}

	public int getScore() {

		return score;
	}

	public void setRank(int r) {

		rank = r;
	}
}








 = r;
	}
}