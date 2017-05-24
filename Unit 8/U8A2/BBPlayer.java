// Ralph Nahra
//
// This class contains the methods for BBPlayer objects

import java.util.StringTokenizer;

public class BBPlayer implements Measurable {

	private int num, year;
	private String pos;
	private double ppg;


	public BBPlayer(String s) {

		StringTokenizer x = new StringTokenizer(s);
		num = Integer.parseInt(x.nextToken());
		year = Integer.parseInt(x.nextToken());
		pos = x.nextToken();
		ppg = Double.parseDouble(x.nextToken());
	}

	public int getNum() {

		return num;
	}

	public int getYear() {

		return year;
	}

	public String getPos() {

		return pos;
	}

	public double getMeasure() {

		return ppg;
	}

	public boolean accept() {

		if (ppg > 10)
			return true;
		else
			return false;
		
	}
}