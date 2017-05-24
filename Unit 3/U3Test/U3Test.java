// Ralph Nahra
//
// This is the driver class for the Postage class

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class U3Test extends JApplet {

	private String amount;

	public void init() {

		String input = JOptionPane.showInputDialog("Enter Postage Type & ounces, separated by a space:");
		String type = input.substring(0,1);
		double weight = Double.parseDouble(input.substring(2));

		Postage p = new Postage(type, weight);

		amount = String.format("$ %.2f", p.calculate());
	}

	public void paint(Graphics g) {

		Font myFont = new Font("Monospaced", Font.BOLD, 16);
		g.setFont(myFont);
		g.drawString("Cost to mail this item =", 50, 100);
		g.drawString(amount, 60, 120);
	}
}