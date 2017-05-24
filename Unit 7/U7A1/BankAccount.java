// Ralph Nahra
//
// This program will create bank accounts

public class BankAccount {

	private double balance;
	private static int lastAccountNum = 100;
	private int accountNum;
	private static final double RATE = 0.04;


	public BankAccount() {
		
		balance = (1000 * Math.random());
		lastAccountNum++;
		accountNum = lastAccountNum;
	}

	public BankAccount(double b) {

		balance = b;
		lastAccountNum++;
		accountNum = lastAccountNum;
	}

	public String deposit(double amount) {

		if (amount <= 0) return "Deposit Rejected";

		else {

			balance += amount;
			return "Deposit Accepted";
		}
	}

	public String withdrawal(double amount) {
		
		if (amount > balance) return "Withdrawal Denied - Insufficient Funds";
		else {

			balance -= amount;
			return "Withdrawal Accepted";
		}
	}

	public void interest() {

		balance = balance + (RATE * balance);
	}

	public int getAccountNum() {

		return accountNum;
	}

	public double getBalance() {

		return balance;
	}

	public static double rate() {

		return (RATE * 100);
	}


}