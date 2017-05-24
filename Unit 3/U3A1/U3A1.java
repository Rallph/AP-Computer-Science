// Ralph Nahra
//
// This is the driver class for the grade class

import javax.swing.JOptionPane;

public class U3A1 {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Please enter Letter Grade: ");
		String input2 = JOptionPane.showInputDialog("Please enter Numeric Grade: ");
		double num = Double.parseDouble(input2);

		Grade g = new Grade(input, num);
		String result1 = g.getNewLetter();
		double result2 = g.getNewNumeric();

		String result = "Numeric grade Equivalent = " + result2 + "\n\nLetter Grade Equivalent = " + result1;

		JOptionPane.showMessageDialog(null, result, "U3A1", JOptionPane.INFORMATION_MESSAGE);



	}
}