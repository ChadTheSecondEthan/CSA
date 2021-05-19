package Module11;

public class BankAccount {

	public BankAccount(String nm, Double amt) {
		name = nm;
		balance = amt;
	}

	public void deposit(double dp) {
		balance = balance + dp;
	}

	public void withdraw(double wd) {
		balance = balance - wd;
	}

	public void setName(String n) {
		name = n;
	}

	public void setBalance(double b) {
		balance = b;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	private String name;
	private double balance;

}
