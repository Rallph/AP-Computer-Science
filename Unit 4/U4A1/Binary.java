//
// This is the binary class for U4A1

public class Binary {

	private String binum;

	public Binary(String b) {

		binum = b;
	}

	public int convert() {

		int exp = (binum.length() - 1);
		int x = 0;
		int y = 1;
		int result = 0;

		while (exp >= 0) {

			int n = 0;

			n = Integer.parseInt(binum.substring(x, y));

			int pow = (int)Math.pow(2, exp);

			int num = n * pow;

			exp--;
			x++;
			y++;
			result += num;
		}

		return result;
	}
}








