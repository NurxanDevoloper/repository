package Lesson29Homework_2;

public class CheckingAccount extends BankAccount {
	final double transactionFee;

	public CheckingAccount(String accountNumber, double balance, double transactionFee) {
		super(accountNumber, balance);
		this.transactionFee = transactionFee;
	}

	@Override
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
		System.out.println("Deposited: " + amount + ". New balance: " + getBalance());
	}

	@Override
	public void withdraw(double amount) {
		double totalAmount = amount + transactionFee;
		setBalance(getBalance() - totalAmount);
		System.out.println("Withdrawn: " + amount + " with fee: " + transactionFee + ". New balance: " + getBalance());
	}
}
