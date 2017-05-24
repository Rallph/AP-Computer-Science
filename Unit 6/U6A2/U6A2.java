// Ralph Nahra
//
// This program will compare merge sort to quick sort

import javax.swing.JTextArea;
import javax.swing.JApplet;
import java.awt.Container;
import java.util.Random;

public class U6A2 extends JApplet {

	private int[] ary1 = new int[10000];
	private int[] ary2 = new int[10000];
	private JTextArea outputArea = new JTextArea();

	public void init() {

		long time = 0;
		Container c = getContentPane();
		c.add(outputArea);
		outputArea.setText("Unsorted Array\n\n");
		buildArrays();
		printNums(ary1);

		outputArea.append("\n\n\nMergeSort\n\n");
		MergeSorter merge = new MergeSorter(ary1);
		long start = System.currentTimeMillis();
		merge.sort();
		long end = System.currentTimeMillis();
		time = end - start;

		printNums(ary1);
		outputArea.append("\n\n" + time + " milliseconds");

		outputArea.append("\n\n\nQuickSort\n\n");
		QuickSorter quick = new QuickSorter(ary2);
		start = System.currentTimeMillis();
		quick.sort(0, 9999);
		end = System.currentTimeMillis();
		time = end - start;

		printNums(ary2);
		outputArea.append("\n\n" + time + " milliseconds");


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

	private void buildArrays() {

		Random generator = new Random();

		for (int i = 0; i < 10000; i++) {

			int x = generator.nextInt(1000);
			ary1[i] = x;
			ary2[i] = x;
		}
	}
}