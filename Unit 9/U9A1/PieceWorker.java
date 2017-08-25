//
// This is the code for the PieceWorker class. It is like a worker
// class except it gets paid hourly as well as for each piece completed.

public class PieceWorker extends Worker {

	private int hours;

	public PieceWorker(String n, double r, int h) {

		super(n,r);
		hours = h;
	}

	public double wage(int pieces) {

		return super.computePay(hours) + this.computePay(pieces);
	}

	public double computePay(int pieces) {

		return pieces * 0.12;
	}
}








