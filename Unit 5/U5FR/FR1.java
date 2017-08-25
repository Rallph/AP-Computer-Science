//
// Unit 5 Free Response question 1

public class FR1 {

	private int[] array = {1,2,3,4,5,6,7};

	public static void main(String[] args) {
		
		FR1 x = new FR1();
	}

	public FR1() {

		System.out.println("Original Array\n");
		for (int x : array)
			System.out.print(x + " ");
		System.out.println();

		rotate();
		System.out.println("Rotated Array\n");
		for (int x : array)
			System.out.print(x + " ");
		System.out.println();

	}

	private void rotate() {

		int[] result = new int[array.length];

		for (int i = (array.length - 1); i > 0; i--) {

			result[0] = array[(array.length - 1)];
			
		}

		array = result;
	}
}


/*


{{1,2,3},
{4,5,6}}

*/








