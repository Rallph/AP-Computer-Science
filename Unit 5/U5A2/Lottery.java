// Ralph Nahra
//
// This is the lottery class for U5A2

public class Lottery {

	private int[] winner = new int [5];
	private int ball;

	public Lottery() {

		winner = generate();
		ball = ballGenerate();
	}

	public int[] generate() {

		int[] result = new int[5];
		int[] smart = new int[59];
		int num;

		for (int i = 0; i < smart.length; i++)
			smart[i] = i + 1;

		for (int i = 0; i < result.length; i++) {

			do {

				num = (int)(59 * Math.random());
			} while (smart[num] == 0);

			result[i] = smart[num];
			smart[num] = 0;
		}

		return result;
	}

	public int ballGenerate() {

		return ((int)(35 * Math.random() + 1));
	}

	public int check(int[] nums, int pb) {

		int accum = 0;
		boolean flag = false;
		if (pb == ball) flag = true;

		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < winner.length; j++) {

				if (nums[i] == winner[j]) accum++;
			}
		}

		if (accum == 5 && flag) return 1000000;
		else if (accum == 5 && !flag) return 500000;
		else if (accum == 4 && flag) return 10000;
		else if (accum == 4 && !flag) return 100;
		else if (accum == 3 && !flag) return 7;
		else if (accum == 2 && flag) return 7;
		else if (accum == 1 && flag) return 4;
		else if (flag) return 4;
		else return 0;
	}

	public int[] getWinner() {

		return winner;
	}

	public int getBall() {

		return ball;
	}


}