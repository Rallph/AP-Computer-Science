//Ralph Nahra
//
// This is the driver class for the RoachPopulation class

public class U1A3 {

	public static void main (String[] args) {

		RoachPopulation r = new RoachPopulation();
		int size;

		r.timePasses();
		size = r.getRoaches();
		System.out.println(size);

		r.spray();
		size = r.getRoaches();
		System.out.println(size);

		r.spray();
		size = r.getRoaches();
		System.out.println(size);

		r.timePasses();
		size = r.getRoaches();
		System.out.println(size);


	}
}


/*

Output:

200
50
12
24
Press any key to continue . . .


*/