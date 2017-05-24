//Ralph Nahra
//
// This is the RoachPopulation class that will
// have the methods for the roach population

public class RoachPopulation {

	private int roaches;

	public RoachPopulation() {

		roaches = 100;


	}

	public void timePasses() {

		roaches = roaches * 2;


	}

	public void spray() {

		roaches = (roaches / 4);

	}

	public int getRoaches() {

		return roaches;
	}




}