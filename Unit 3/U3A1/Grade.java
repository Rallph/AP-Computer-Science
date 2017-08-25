//
// This is the Grade class for U3A1

public class Grade {

	private String origLetter, newLetter;
	private double origNumeric, newNumeric;

	public Grade(String l, double n) {

		origLetter = l;
		origNumeric = n;

		setNewNumeric();
		setNewLetter();
	}


	public String getNewLetter() {

		return newLetter;
	}

	public double getNewNumeric() {

		return newNumeric;
	}

	public void setNewNumeric() {

		String letter = origLetter.substring(0,1);
		String end = origLetter.substring(1);


		if (letter.equals("A")) {

			newNumeric = 4.0;
		} else if (letter.equals("B")) {

			newNumeric = 3.0;
		} else if (letter.equals("C")) {

			newNumeric = 2.0;
		} else if (letter.equals("D")) {

			newNumeric = 1.0;
		} else if (letter.equals("F")) {

			newNumeric = 0;
		}


		if (end.equals("+")) {

			newNumeric += 0.3;
		} else if (end.equals("-")) {

			newNumeric -= 0.3;
		}

		if (newNumeric > 4.0) {

			newNumeric = 4.0;
		} else if (newNumeric < 0) {

			newNumeric = 0;
		}

	}

	public void setNewLetter() {

		if (origNumeric == 4.0) {

			newLetter = "A+";
		} else if ((origNumeric >= 3.85) && (origNumeric <= 3.99)) {

			newLetter = "A";
		} else if ((origNumeric >= 3.50) && (origNumeric <= 3.84)) {

			newLetter = "A-";
		} else if ((origNumeric >= 3.15) && (origNumeric <= 3.49)) {

			newLetter = "B+";
		} else if ((origNumeric >= 2.85) && (origNumeric <= 3.14)) {

			newLetter = "B";
		} else if ((origNumeric >= 2.50) && (origNumeric <= 2.84)) {

			newLetter = "B-";
		} else if ((origNumeric >= 2.15) && (origNumeric <= 2.49)) {

			newLetter = "C+";
		} else if ((origNumeric >= 1.85) && (origNumeric <= 2.14)) {

			newLetter = "C";
		} else if ((origNumeric >= 1.50) && (origNumeric <= 1.84)) {

			newLetter = "C-";
		} else if ((origNumeric >= 1.15) && (origNumeric <= 1.49)) {

			newLetter = "D+";
		} else if ((origNumeric >= 0.85) && (origNumeric <= 1.14)) {

			newLetter = "D";
		} else if ((origNumeric >= 0.50) && (origNumeric <= 0.84)) {

			newLetter = "D-";
		} else {

			newLetter = "F";
		}
	}
}








