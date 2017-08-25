//
// This program will compare sequential and binary searches

import javax.swing.JTextArea;
import javax.swing.JApplet;
import java.awt.Container;
import java.awt.Font;

public class U6A3 extends JApplet {

	private int[] a;
	private int[] vals = {2, 2629, 11176, 27032, 43661};
	private JTextArea outputArea = new JTextArea();

	public void init() {

		Container c = getContentPane();
		c.add(outputArea);
		a = buildArray();
		Font font = new Font("Monospaced", Font.PLAIN, 16);
		outputArea.setFont(font);
		outputArea.setTabSize(8);
		outputArea.setText("The Array\n\n");

		for (int i = 0; i < 300; i++) {

			outputArea.append(a[i] + "\t");
			if ((i + 1) % 15 == 0)
				outputArea.append("\n");
		}

		outputArea.append("\n\n\n\nSearch Comparisons using # of visits to the Array\n\n");
		outputArea.append("Number  Sequential    Binary\n");
		outputArea.append("------  ----------    ------\n");

		for (int i = 0; i < vals.length; i++) {

			int seq = sequential(vals[i]);
			int bin = binary(vals[i]);

			outputArea.append(vals[i] + "\t");

			if (seq == -1)
				outputArea.append("Not Found     ");
			else
				outputArea.append(seq + "\t      ");

			if (bin == -1)
				outputArea.append("Not Found\n");
			else
				outputArea.append(bin + "\n");
		}
	}

	private int sequential(int target) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == target)
				return i + 1;
		}

		return -1;
	}

	private int binary(int target) {

		int low = 0;
		int high = a.length - 1;
		int mid, dif, count = 0;

		while (low <= high) {

			count++;
			mid = (low + high) / 2;
			dif = a[mid] - target;

			if (dif == 0)
				return count;
			else if (dif < 0)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

	private int[] buildArray() {

		int[] ary = new int[300];
		ary[0] = 1;

		for (int i = 1; i < 300; i++) {

			ary[i] = ary[i - 1] + i;
		}

		return ary;
	}
}








