package Lesson29Homework_2;

public class SavingsAccount extends BankAccount{
	
    private double minimumBalance;


	public SavingsAccount(String accountNumber, double balance, double minimumBalance) {
		super(accountNumber, balance);
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
	        if (amount > 0 && getBalance() - amount >= minimumBalance) {
	            setBalance(getBalance() - amount);
	            System.out.println("Withdrawn: " + amount + ". New balance: " + getBalance());
	        } else {
	            System.out.println("Withdrawal denied. Minimum balance requirement not met.");
	        }
	    }
}
