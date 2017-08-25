//
// This driver class will use the Measurable interface
// to proccess data from BankAccount classes and BBPlayer
// classes to produce DataSets.

import javax.swing.JTextArea;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class U8A2 extends JFrame {

	private JTextArea output = new JTextArea();

	public static void main(String[] args) {
		
		U8A2 x = new U8A2();
		x.setSize(500,500);
		x.setVisible(true);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public U8A2() {

		testBBPlayer();
		testBankAccount();
	}

	public void testBBPlayer() {

		String input;
		Dataset z = new Dataset();

		try {

			Scanner in = new Scanner (new File
				("U:\\STUDENT\\PROJECTS\\West Projects\\Computer Science\\JavaData\\u7test.txt"));

			for (int i = 0; i < 5; i++) {

				input = in.nextLine();
				BBPlayer player = new BBPlayer(input);
				z = new Dataset(player);
			}
			in.close();

		} catch (IOException e) {

			throw new RuntimeException (e.toString());
		}

		Container c = getContentPane();
		output.setFont(new Font("Monospaced", Font.BOLD, 14));
		output.setText("BBPlayer Stats\n");
		output.append("--------------\n\n");
		double bbmin, bbmax, bbave;
		bbmin = z.getMin();
		bbmax = z.getMax();
		bbave = z.getAve();

		output.append("Minimum Points Per Game = " + bbmin + "\n\n");
		output.append("Maximum Points Per Game = " + bbmax + "\n\n");
		output.append("Average Points Per Game = " + String.format("%.2f", bbave) + "\n\n");
		c.add(output);
	}

	public void testBankAccount() {

		String inputLine;
		Dataset d = new Dataset();

		try {

			Scanner in = new Scanner (new File
			("U:\\STUDENT\\PROJECTS\\West Projects\\Computer Science\\JavaData\\myCreditUnion.txt"));

			while (in.hasNext()) {

				String line = in.nextLine();
				StringTokenizer t = new StringTokenizer(line);

				String num = t.nextToken();
				double amount = Double.parseDouble(t.nextToken());
				BankAccount acc = new BankAccount(amount, num);
				d = new Dataset(acc);
			}	

		} catch (IOException e) {

			throw new RuntimeException(e.toString());
		}

		output.append("\nBankAccount Stats\n");
		output.append("-----------------\n\n");
		double bamin, bamax, baave;
		bamin = d.getMin();
		bamax = d.getMax();
		baave = d.getAve();

		output.append("Minimum Bank Account = " + bamin + "\n\n");
		output.append("Maximum Bank Account = " + bamax + "\n\n");
		output.append("Average Bank Account = " + String.format("%.2f", baave) + "\n\n");

	}


}








