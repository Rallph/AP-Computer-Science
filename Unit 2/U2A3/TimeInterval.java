// Ralph Nahra
//
// This is the TimeInterval class for U2A3

public class TimeInterval {

	private double pay;
	private int task;

	public TimeInterval(int startTime, int endTime, double payRate) {

		int start = ((startTime/100) * 60) + (startTime%100);
		int end = ((endTime/100) * 60) + (endTime%100);

		task = end - start;

		double time = task / 60.0;

		pay = time * payRate;


	}

	public int getHours() {

		int hours = task / 60;

		return hours;
	}

	public int getMinutes() {

		int minutes = task % 60;

		return minutes;
	}

	public double getPay() {

		return pay;
	}
}