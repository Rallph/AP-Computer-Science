//
// This program will create bank accounts

public class BankAccount implements Measurable {

	private double balance;
	private int accountNum;
	private static final double RATE = 0.04;
	private String accountType;


	
	public BankAccount(double b, String a) {

		balance = b;
		setAccountType(a);
		accountNum = Integer.parseInt(a.substring(0,3));
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

		if (accountType.equals("s"))
			balance = balance + (RATE * balance);
	}

	public double getMeasure() {

		return balance;
	}

	public static double rate() {

		return (RATE * 100);
	}

	private void setAccountType(String a) {

		accountType = a.substring(3);
	}

	public int getAccountNum() {

		return accountNum;
	}

	public String getAccountType() {

		return accountType;
	}

	public boolean accept() {

		if (balance > 1000)
			return true;
		else
			return false;
		
	}


}








