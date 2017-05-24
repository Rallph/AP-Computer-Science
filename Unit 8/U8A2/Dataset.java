// Ralph Nahra
//
// This is the dataset that will be used
// for BBPlayer and BankAccount by using the 
// Measurable interface

public class Dataset {

	private static double max;
	private static double min;
	private static double ave;
	private static double sum;
	private static int count;

	public Dataset() {

		max = 0;
		min = 0;
		ave = 0;
		sum = 0;
		count = 0;
	}

	public Dataset(Measurable x) {


		if (x.accept()) {

			count++;
			sum += x.getMeasure();
			if (count == 1) {

				max = x.getMeasure();
				min = x.getMeasure();
				
			} else {

				if (x.getMeasure() > max)
					max = x.getMeasure();
				if (x.getMeasure() < min)
					min = x.getMeasure();
			}

			ave = sum / count;

		}
	}

	public double getMax() {

		return max;
	}

	public double getMin() {

		return min;
	}

	public double getAve() {

		return ave;
	}
}