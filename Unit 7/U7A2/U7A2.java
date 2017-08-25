//
// This is the driver class for U7A2

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class U7A2 extends JFrame {

	private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	private JTextArea output = new JTextArea();
	private Container c = getContentPane();

	public static void main(String[] args) {

		U7A2 x = new U7A2();
		x.setSize(500,500);
		x.setVisible(true);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public U7A2() {

		BuildList();
		
		PrintList();
		Deposit("103s", 500);
		Withdraw("110s", 304.52);
		InsertNewAcct("105c", 300);
		DeleteDormantAccts();
		CorrectError("107s", 1113.88);
		ApplyInterest();
		InsertNewAcct("111s", 100);
		FileUpdated();
		

	}

	private void BuildList() {

		try {

			Scanner reader = new Scanner(new File("U:\\STUDENT\\PROJECTS\\West Projects\\Computer Science\\JavaData\\myCreditUnion.txt"));

			while (reader.hasNext()) {
				
				String line = reader.nextLine();

				String num = line.substring(0,4);
				double amount = Double.parseDouble(line.substring(5));
				accounts.add(new BankAccount(amount, num));
			}

			reader.close();

		} catch (IOException e) {

			throw new RuntimeException(e.toString());
		}
	}

	private void PrintList() {

		c.add(output);
		output.setText("Account#\tBalance\n");
		output.setTabSize(13);

		for (int i = 0; i < accounts.size(); i++) {

			BankAccount x = accounts.get(i);
			String acctNum = x.getAccountNum() + x.getAccountType();
			output.append(acctNum + "\t" + String.format("$ %.2f", x.getBalance()) + "\n");
		}
		output.append("\n");
	}


	private void Deposit(String acctNum, double dep) {

		BankAccount acct = accounts.get(search(acctNum));
		String result = acct.deposit(dep);
		output.append(result + "\n");
	}

	private void Withdraw(String acctNum, double with) {
		
		BankAccount acct = accounts.get(search(acctNum));
		String result = acct.withdrawal(with);
		output.append(result + "\n");

	}

	private void InsertNewAcct(String acctNum, double initdep) {

		BankAccount account = new BankAccount(initdep, acctNum);
		int index = 0;
		if ((acctNum.substring(3)).equals("c")) {
			String term = acctNum.substring(0,3) + "s";
			index = search(term);
			accounts.add((index + 1), account);
		} else {

			accounts.add(account);
		}

		output.append("New Account Added\n");
	}

	private void DeleteDormantAccts() {

		int num = 0;
		for (int i = 0; i < accounts.size(); i++) {

			BankAccount x = accounts.get(i);
			if (x.getBalance() == 0) {
				accounts.remove(i);
				num++;
			}

		}

		output.append(num + " Account(s) Removed\n");
	}

	private void CorrectError(String acctNum, double bal) {

		BankAccount x = new BankAccount(bal, acctNum);
		accounts.set(search(acctNum),x);
		output.append("Correction Completed\n");
	}

	private void ApplyInterest() {

		for (int i = 0; i < accounts.size(); i++) {

			BankAccount x = accounts.get(i);
			x.interest();
		}

		output.append("Interest Applied to all Savings Accounts\n");
	}

	private void FileUpdated() {

		try {

			FileWriter writer = new FileWriter("temp.txt");
			PrintWriter out = new PrintWriter(writer);

			for (int i = 0; i < accounts.size(); i++) {

				BankAccount x = accounts.get(i);
				String outstring = (x.getAccountNum() + x.getAccountType()) + " " + String.format( "%.2f",x.getBalance());
				out.println(outstring);
			}

			out.close();
		} catch (IOException e) {

			throw new RuntimeException(e.toString());
		}

		output.append("File Updated\n");
	}

	private int search(String acctNum) {


		int num = Integer.parseInt(acctNum.substring(0,3));
		String type = acctNum.substring(3);
		for (int i = 0; i < accounts.size(); i++) {

			BankAccount x = accounts.get(i);
			if ((x.getAccountNum() == num) && ((x.getAccountType()).equals(type)))
				return i;
		}

		return -1;
	}


}










