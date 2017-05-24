// Ralph Nahra
//
// This is the code for the SalariedWorker class. It is just like a worker
// except it only gets paid for 40 hours of work no matter what.

public class SalariedWorker extends Worker {

	private int hours;

	public SalariedWorker(String n, double r, int h) {

		super(n,r);
		hours = h;
	}

	public double wage() {

		return computePay(40);
	}
}