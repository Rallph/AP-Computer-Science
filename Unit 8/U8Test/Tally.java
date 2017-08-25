//
// This is the class for the Tally object which 
// tallies the number of objects in a given array
// using polymorphism.

public class Tally {

	private String[] item;
	private int[] tally;

	public Tally(String[] outcomes) {

		item = new String[outcomes.length];

		System.arraycopy(outcomes, 0, item, 0 , outcomes.length);
		tally = new int[outcomes.length];

		for(int i = 0; i < tally.length; i++) {

			tally[i] = 0;
		}
	}

	public void process (Measurable x) {

		String result = x.getResult();

		for(int i = 0; i < item.length; i++) {

			if (result.equals(item[i])) {

				tally[i]++;
			}
		}
	}

	public int[] getTally() {

		return tally;
	}
}










