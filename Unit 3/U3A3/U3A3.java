// Ralph Nahra
//
// This is the driver class for the month class

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Container;

public class U3A3 extends JApplet {

	public void init() {

		int input = Integer.parseInt(JOptionPane.showInputDialog("Please enter month as a number: "));
		String name = "";

		switch (input) {
			case 1:
				name = "January";
				break;
			case 2:
				name = "February";
				break;
			case 3:
				name = "March";
				break;
			case 4:
				name = "April";
				break;
			case 5:
				name = "May";
				break;
			case 6:
				name = "June";
				break;
			case 7:
				name = "July";
				break;
			case 8:
				name = "August";
				break;
			case 9:
				name = "September";
				break;
			case 10:
				name = "October";
				break;
			case 11:
				name = "November";
				break;
			case 12:
				name = "December";
				break;

		}

		Month m = new Month(input);
		String days = m.getDays();
		String result = "The month of " + name + " has " + days + " days.";

		JTextArea outputArea = new JTextArea();
		outputArea.setText(result);

		Container container = getContentPane();
		container.add(outputArea);
	}
}