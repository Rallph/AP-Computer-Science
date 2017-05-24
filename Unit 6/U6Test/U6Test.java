// Ralph Nahra
//
// This program will sort and search lists of names

import javax.swing.JApplet;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Font;

public class U6Test extends JApplet {

	private String[] ary1 = {"Barr","Chamberlain","Fullam",
							"Gertler","Jones","Krantzler","Ferguson","Litchfield",
							"Johnson","Sundeen","Baker","Celebucki","Dungan",
							"Eckert","Framke","Hoekstra","Jackson","Klupchak",
							"Kurtz","Mahler","Maxwell","Rothermel","Tarjan",
							"Tiller","Turek"};

	private String[] ary2 = (String[])ary1.clone();

	private JTextArea output = new JTextArea();

	public void init() {

		
		Container c = getContentPane();
		c.add(output);
		Font font = new Font("Monospaced", Font.PLAIN, 12);
		output.setFont(font);
		output.setTabSize(24);
		output.setText("Sorted Alphabetically\tSorted by Length\n");
		output.append( "---------------------\t----------------\n");
		alphabetize(ary1);
		alphabetize(ary2);
		insertion();
		printNames();

		output.append("\nJones at index " + binary("Jones") + "\tJones at index " + sequential("Jones"));



	}

private void alphabetize(String[] ary1) {

		int minPos;
		String temp;

		for (int j = 0; j < ary1.length; j++) {

			minPos = j;

			for (int k = j + 1; k < ary1.length; k++) {

				if (ary1[k].compareTo(ary1[minPos]) < 0)
					minPos = k;
			}

			temp = ary1[j];
			ary1[j] = ary1[minPos];
			ary1[minPos] = temp;
		}
	}

	private void insertion() {

		int j;
		String temp;

		for (int n = 1; n < ary2.length; n++) {

			temp = ary2[n];
			j = n;

			while ( j > 0 && temp.length() < ary2[j - 1].length()) {

				ary2[j] = ary2[j - 1];
				j--;
			}

			ary2[j] = temp;
		}
	}

	private int sequential(String target) {

		for (int i = 0; i < ary2.length; i++) {

			if (ary2[i].equals(target))
				return i;
		}

		return -1;
	}

	private int binary(String target) {

		int low = 0;
		int high = ary1.length - 1;
		int mid, dif, count = 0;

		while (low <= high) {

			count++;
			mid = (low + high) / 2;
			dif = ary1[mid].compareTo(target);

			if (dif == 0)
				return mid;
			else if (dif < 0)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

	private void printNames() {

		for (int i = 0; i < ary1.length; i++) {

			output.append(ary1[i] + "\t" + ary2[i] + "\n");
		}
	}
}