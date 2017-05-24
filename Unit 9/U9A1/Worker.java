// Ralph Nahra
//
// This class is the worker superclass which will be used by 
// other classes including HourlyWorker, SalariedWorker, 
// and PieceWorker


import java.util.StringTokenizer;

public class Worker {

	private String name;
	private double rate;


	public Worker(String n, double r) {

		name = n;
		rate = r;
	}

	public double computePay(int hours) {

		return rate * hours;
	}

	public String getName() {

		StringTokenizer s = new StringTokenizer(name);
		String in = (s.nextToken()).substring(0,1) + ".";
		String l = s.nextToken();

		return l + ", " + in;
	}

	public double getRate() {

		return rate;
	}



}


/*

public void proletariatRevolution(boolean c) {
	
	boolean capitalism = c;
	boolean isExploited = false;


	if (capitalism)
		isExploited = true;

	if (isExploited) {
	
		capitalist.setCapital(0);
		meansofproduction.setOwner("Workers");

		bourgeoisie = null;
		state = null;
		isExploited = false;
	}

}

*/


