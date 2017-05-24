// Ralph Nahra
//
// This will draw a tax liability report on an applet

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class U3A2 extends JApplet {

	private double tax;
	private String name;
	private String status;
	private String blind;
	private String age;
	private int exemptions;
	private double income;
	private double withheld;
	private double payment;
	private String message;

	public void init() {

		name = JOptionPane.showInputDialog("Enter your name: ");
		status = JOptionPane.showInputDialog("Enter Filing Status - Single(S) or Married(M):");
		blind = JOptionPane.showInputDialog("Are you blind? Yes or No: ");
		age = JOptionPane.showInputDialog("Are you over 65? Yes or No: ");
		exemptions = Integer.parseInt(JOptionPane.showInputDialog("Enter total number of exemptions: "));
		income = Integer.parseInt(JOptionPane.showInputDialog("Enter wages, salaries, & tips: "));
		withheld = Double.parseDouble(JOptionPane.showInputDialog("Enter Income Tax Withheld: "));

		if (status.equals("M")) {

			String sblind = JOptionPane.showInputDialog("Is your spouse blind? Yes or No: ");
			String sage = JOptionPane.showInputDialog("Is your spouse over 65? Yes or No: ");
			if (sblind.equals("Yes")) {

				exemptions++;
			}
			if (sage.equals("Yes")) {

				exemptions++;
			}
		}

		if (blind.equals("Yes")) {

			exemptions++;
		}
		if (age.equals("Yes")) {

			exemptions++;
		}

		double tincome = income - (exemptions * 1000);


		if (status.equals("S")) {

			if ((tincome > 0) && (tincome < 21450)) {

				tax = tincome * 0.15;
			} else if ((tincome > 21450) && (tincome < 51900)) {

				tax = (0.28 * (tincome - 21450)) + 3217.50;
			} else if (tincome > 51900) {

				tax = (0.31 * (tincome - 51900)) + 11743.50;
			}
		}

		if (status.equals("M")) {

			if ((tincome > 0) && (tincome < 35800)) {

				tax = tincome * 0.15;
			} else if ((tincome > 35800) && (tincome < 86500)) {

				tax = ((tincome - 35800) * 0.28) + 5370;
			} else if (tincome > 86500) {

				tax = ((tincome - 86500) * 0.31) + 19566;
			}
		}

		if (withheld > tax) {

			message = "Refund =   $";
			payment = withheld - tax;

		} else if (withheld < tax) {

			message = "Owed =   $";
			payment = tax - withheld;
		}

		setBackground(Color.white);
	}

	public void paint (Graphics g) {

		Font myFont = new Font("Monospaced", Font.BOLD, 16);
		g.setFont(myFont);
		String amount = String.format("%.2f", payment);

		g.drawString(name + ", below you will find", 10, 100);
		g.drawString("the result of your tax inquiry.", 10, 120);
		g.drawString(message + amount, 75, 170);
	}


}