package Lesson29Homework_2;

public class CheckingAccount extends BankAccount{
	  private double transactionFee;

	    public CheckingAccount(String accountNumber, double balance, double transactionFee) {
	        super(accountNumber, balance);
	        this.transactionFee = transactionFee;
	    }

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            setBalance(getBalance() + amount);
	            System.out.println("Deposited: " + amount + ". New balance: " + getBalance());
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        double totalAmount = amount + transactionFee;
	        if (amount > 0 && getBalance() >= totalAmount) {
	            setBalance(getBalance() - totalAmount);
	            System.out.println("Withdrawn: " + amount + " with fee: " + transactionFee + ". New balance: " + getBalance());
	        } else {
	            System.out.println("Withdrawal denied. Insufficient funds.");
	        }
	    }
}
