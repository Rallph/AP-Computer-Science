// Ralph Nahra
//
// This program will draw a salary schedule
// in an applet based on input

import javax.swing.JApplet;
import javax.swing.JTextArea;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Container;
import java.util.StringTokenizer;

public class U4A3 extends JApplet {

	public void init() {

		String input = JOptionPane.showInputDialog("Enter Base Salary (10000 - 50000),\nEnter Number of Lanes (3 - 6),\nEnter Number of Steps per Lane (10 - 20)\n\n(Separate the numbers with single spaces)");
		StringTokenizer x = new StringTokenizer(input);
		int bs = Integer.parseInt(x.nextToken());
		int l = Integer.parseInt(x.nextToken());
		int s = Integer.parseInt(x.nextToken());
		JTextArea outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		Font font = new Font("Monospaced", Font.PLAIN, 16);
		outputArea.setFont(font);
		outputArea.setTabSize(5);
		outputArea.setText("\t\t   Salary Schedule\n\n");
		outputArea.append("     ");


		int count = 1;

		do {

			outputArea.append("  " + count + "    ");
			count++;
			if (count > l)
				outputArea.append("\n\n\n");

		} while (count <= l);



		for (int out = 1; out <= s; out++) {

			int cs = bs;
			outputArea.append(out + "\t");

			for (int in = 1; in <= l; in++) {

				if (in != 1)
					cs += (int)(cs * 0.09);
				outputArea.append(cs + "  ");
			}

			outputArea.append("\n");
			bs *= 1.03;
		}


	}
}