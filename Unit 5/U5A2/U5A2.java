//
// This is the driver class for the U5A2 Lottery Project

public class U5A2 {

	public static void main(String[] args) {

		Lottery x = new Lottery();
		System.out.println("This Week's Numbers Are:");
		int[] win = x.getWinner();
		for (int i : win)
			System.out.print(i + " ");
		System.out.print(x.getBall() + "\n\n");


		int four = 0;
		int seven = 0;
		int hundred = 0;
		int tenk = 0;
		int halfmil = 0;
		int mil = 0;

		for (int i = 0; i < 1000000; i++) {

			int[] nums = x.generate();
			int pb = x.ballGenerate();
			int result = x.check(nums,pb);

			switch(result) {

				case 4:
					four++;
					break;
				case 7:
					seven++;
					break;
				case 100:
					hundred++;
					break;
				case 10000:
					tenk++;
					break;
				case 500000:
					halfmil++;
					break;
				case 1000000:
					mil++;
					break;
			}

			if (result >= 10000) {

				System.out.print()
			}

		}
	}
}








