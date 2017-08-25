//
// This is the DataSet class for U2 Test Project

public class DataSet {

	private int sum, count;

	public DataSet() {

		sum = 0;
		count = 0;
	}

	public DataSet(int s, int c) {

		sum = s;
		count = c;
	}

	public int getSum() {

		return sum;
	}

	public int getCount() {

		return count;
	}

	public void addValue(int x) {

		sum += x;
		count++;
	}

	public double average() {

		double average = sum / (double)count;
		return average;
	}
}








