//
// This is the driver class for the BankAccount class

import javax.swing.JApplet;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Font;

public class U7A1 extends JApplet {

	public void init() {

		JTextArea output = new JTextArea();
		Container c = getContentPane();
		Font font = new Font("Monospaced", Font.PLAIN, 16);
		output.setFont(font);
		c.add(output);
		output.setText("Account Information\n-------------------\n\n\n");

		BankAccount x = new BankAccount();
		BankAccount y = new BankAccount(1500);

		output.append("Initial Balance for Account " + x.getAccountNum() + " = $ " + String.format("%.2f" ,x.getBalance()));
		output.append("\nInitial Balance for Account " + y.getAccountNum() + " = $ " + String.format("%.2f" ,y.getBalance()) + "\n\n");


		String d1 = x.deposit(300);
		String d2 = y.deposit(200);
		output.append(d1 + "\n" + d2 + "\n\n");

		String w3 = x.withdrawal(250);
		String w4 = y.withdrawal(125);
		output.append(w3 + "\n" + w4 + "\n\n");

		double w = 550.0;
		String w1 = x.withdrawal(w);
		output.append(w1 + "\n");
		String w2 = "";

		x.interest();
		y.interest();

		if (w1.equals("Withdrawal Accepted"))
			w2 = y.deposit(w);
		else
			w2 = y.deposit(0);

		output.append(w2 + "\n");

		x.interest();
		y.interest();

		output.append("\nFinal Balance for Account " + x.getAccountNum() + " = $ " + String.format("%.2f" ,x.getBalance()));
		output.append("\nFinal Balance for Account " + y.getAccountNum() + " = $ " + String.format("%.2f" ,y.getBalance()));

		output.append("\n\nInterest Rate = " + BankAccount.rate() + " %");

	}

}








