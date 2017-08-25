// 
// This is the code for the HourlyWorker class, which is a subclass of
// the Worker class. It has an instance field for number of hours. 

public class HourlyWorker extends Worker {

	private int hours;


	public HourlyWorker(String n, double r, int h) {

		super(n,r);
		hours = h;
	}

	public double wage() {

		if (hours <= 40)
			return computePay(hours);
		else {

			int over = hours - 40;
			return computePay(40) + (1.5 * computePay(over));
		}
	}
}








