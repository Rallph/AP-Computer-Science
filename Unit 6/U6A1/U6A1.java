// Ralph Nahra
//
// This program will compare selection sort to insertion sort

import javax.swing.JTextArea;
import javax.swing.JApplet;
import java.awt.Container;
import java.util.Random;

public class U6A1 extends JApplet {

	private int[] ary1 = new int[10000];
	private int[] ary2 = new int[10000];
	private JTextArea outputArea = new JTextArea();
	private long time;

	public void init() {

		buildArrays();
		Container c = getContentPane();
		c.add(outputArea);
		outputArea.setText("Unsorted Array\n\n");
		printNums(ary1);
		outputArea.append("\n\n\nAfter Selection Sort\n\n");
		selection();
		printNums(ary1);
		outputArea.append("\n\nTime = " + time + " milliseconds\n\n");
		insertion();
		outputArea.append("\n\n\nAfter Insertion Sort\n\n");
		printNums(ary2);
		outputArea.append("\n\nTime = " + time + " milliseconds");



	}

	private void buildArrays() {

		Random generator = new Random();

		for (int i = 0; i < 10000; i++) {

			int x = generator.nextInt(1000);
			ary1[i] = x;
			ary2[i] = x;
		}
	}

	private void selection() {

		long start = System.currentTimeMillis();
		int minPos, temp;

		for (int j = 0; j < ary1.length; j++) {

			minPos = j;

			for (int k = j + 1; k < ary1.length; k++) {

				if (ary1[k] < ary1[minPos])
					minPos = k;
			}

			temp = ary1[j];
			ary1[j] = ary1[minPos];
			ary1[minPos] = temp;
		}

		long end = System.currentTimeMillis();
		time = end - start;
	}

	private void insertion() {

		long start = System.currentTimeMillis();
		int j, temp;

		for (int n = 1; n < ary2.length; n++) {

			temp = ary2[n];
			j = n;

			while ( j > 0 && temp < ary2[j - 1]) {

				ary2[j] = ary2[j - 1];
				j--;
			}

			ary2[j] = temp;
		}

		long end = System.currentTimeMillis();
		time = end - start;
	}

	private void printNums(int[] ary) {

		for (int i = 0; i < 15; i++) {

			outputArea.append(ary[i] + "\t");
		}

		outputArea.append("\n    .\n    .\n    .\n");

		for (int i = (ary.length - 15); i < ary.length; i++) {

			outputArea.append(ary[i] + "\t");
		}
	}


}