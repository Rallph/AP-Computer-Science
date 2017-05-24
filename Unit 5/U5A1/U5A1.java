// Ralph Nahra
//
// This project will take two sets of grades and find the
// means, standard deviations, and correlation

public class U5A1 {

	public static void main(String[] args) {

		U5A1 app = new U5A1();
	}

	public U5A1() {

		int[] apExam = {4,5,5,5,3,2,5,4,5,4,3,4,5,4,4,5,4};
		int[] grades = {5,5,5,5,4,4,5,3,5,4,4,5,5,4,4,5,4};

		System.out.printf("Mean of AP Exams = %.2f\n", mean(apExam));
		System.out.printf("Mean of Grades   = %.2f\n\n", mean(grades));
		System.out.printf("Standard Deviation of AP Exams  = %.2f\n", standardDev(apExam));
		System.out.printf("Standard Deviation of Grades    = %.2f\n\n", standardDev(grades));
		System.out.printf("Correlation  = %.2f\n\n", correlation(apExam, grades));

	}

	private double mean(int[] a) {

		double sum = 0;

		for (int x : a)
			sum += x;

		return (sum / a.length);
	}

	private double standardDev(int[] a) {

		double sum = 0;
		double mean = mean(a);
		for (int x : a)
			sum += Math.pow(x - mean, 2);


		return Math.sqrt((sum / a.length));

	}

	private double correlation(int[] a, int[] b) {

		double sum = 0;

		for (int i = 0; i < a.length; i++)
			sum += (((a[i] - mean(a)) * (b[i] - mean(b))) / ((a.length - 1) * standardDev(a) * standardDev(b)));

		return sum;

	}
}