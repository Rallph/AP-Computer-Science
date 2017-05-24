// Ralph Nahra
//
// This is the class for the Quiz object, which
// assigns a letter grade based on a given score

public class Quiz implements Measurable {

	private int score;
	private String grade;

	public Quiz(int s) {

		score = s;
		setGrade();
	}

	public void setGrade() {

		if (score >= 90)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if (score >= 70)
			grade = "C";
		else if (score >= 60)
			grade = "D";
		else grade = "F";
	}

	public String getResult() {

		return grade;
	}


}