// Ralph Nahra
//
// This is the U4A1 driver class for the Binary class

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Container;
import javax.swing.JApplet;
import java.awt.Font;

public class U4A1 extends JApplet {

	public void init() {

		JTextArea outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		Font font = new Font("Monospaced", Font.BOLD, 16);
		outputArea.setFont(font);
		outputArea.setText("Results of U4A1\n\n");
		String input = JOptionPane.showInputDialog("Enter Binary Number:");
		int count = 0;
		double accum = 0;
		int value = 0;

		while (Integer.parseInt(input) != -1) {

			Binary x = new Binary(input);
			value = x.convert();

			outputArea.append("Number " + count + ": " + input + "= \t" + value + "\n");
			count++;
			accum += value;
			input = JOptionPane.showInputDialog("Enter Binary Number:");

		}

		outputArea.setTabSize(18);
		outputArea.append("Number of Numbers\t" + "= " + count + "\n");
		outputArea.append("Accumulated Value\t" + "= " + (int)accum + "\n");
		outputArea.append("Mean\t" + "= " + String.format("%.2f", (accum/count)));



	}
}