package BankAccount;

public class Class {

	private double balance;
	
	public Class() {
		this.balance = 0;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}


	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
}
