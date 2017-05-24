// Ralph Nahra
//
// This will find the next prime number after the number given
// by user input

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Container;


public class U4Test extends JApplet {

	public void init() {

		long oNum = Long.parseLong(JOptionPane.showInputDialog("Enter Base Number:"));
		long num = oNum;
		boolean prime = false;
		long start;

		Container container = getContentPane();
		JTextArea outputArea = new JTextArea();
		container.add(outputArea);

		start = System.currentTimeMillis();

		if ((num % 2) == 0) num ++;
		else num += 2;


		while (!prime) {

			for (long div = 3; div <= Math.sqrt(num); div += 2) {

				if ((num % div) == 0) {

					prime = false;
					break;
				} else
					prime = true;
			}
			if (!prime) num += 2;
		}

		long end = System.currentTimeMillis();
		long time = end - start;


		outputArea.append("Results of the Prime Number Search\n\n");
		outputArea.append("Base Number = " + oNum + "\n\n");
		outputArea.append("Prime Number = " + num + "\n\n");
		outputArea.append("Elapsed Time = " + time + " milliseconds\n\n");

	}

}