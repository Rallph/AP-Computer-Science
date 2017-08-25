//
// This is the DistanceChart class for the Unit 5 test project

public class DistanceChart {

	private String[] cityNames;
	private int[][] distances;

	public DistanceChart(int [][] d, String[] cn) {

		distances = d;
		cityNames = cn;
	}

	public int findRemoteCity() {

		int accum = 0;
		int index = 0;
		int newAccum = 0;

		for (int i = 0; i < distances.length; i++) {

			for (int j = 0; j < distances[i].length; j++) {

				newAccum += distances[i][j];
			}


			if (newAccum > accum) {

				accum = newAccum;
				index = i;
			}
			newAccum = 0;

		}
		for (int i = 0; i < distances.length; i++) {

			distances[i][index] = Integer.MAX_VALUE;


		}
		return index;
	}

	public int findNearestCity(int index) {

		int c = Integer.MAX_VALUE;
		int dex = 0;



		for(int i = 0; i < distances.length; i++) {

			if(c > distances[index][i] && distances[index][i] != 0) {

				c = distances[index][i];
				dex = i;
			}
		}


		for (int i = 0; i < distances.length; i++) {

			distances[i][dex] = Integer.MAX_VALUE;


		}


		return dex;
	}


	public String[] makeItinerary() {

		String[] result = new String[5];

		int r = findRemoteCity();
		result[0] = cityNames[r];


		int temp = findNearestCity(r);

		for (int i = 1; i < 5; i++) {

			result[i] = cityNames[temp];
			temp = findNearestCity(temp);
		}


		return result;
	}
}









