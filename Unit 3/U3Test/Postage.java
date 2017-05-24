// Ralph Nahra
//
// This the the postage class for the U3 test project

public class Postage {

	String type;
	double weight;

	public Postage(String t, double w) {

		type = t;
		weight = w;
	}

	public double calculate() {

		double cost = 0;

		if (weight > 13) {

			type = "P";
		}

		if (type.equals("F")) {

			cost = 0.34 + (Math.ceil((weight - 1)) * 0.21);
		}

		if (type.equals("P")) {

			if (weight <= 16) {

				cost = 3.50;
			} else if ((weight > 16) && (weight <= 32)) {

				cost = 3.95;
			} else if (weight > 32) {

				cost = 3.95 + 1.20 * Math.ceil((weight - 32) / 16);
			}
		}

		return cost;
	}
}