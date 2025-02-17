package Lesson29Homework_2;

public class main {

	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount("Snjdfnvj83947823", 1000, 500);
		CheckingAccount checking = new CheckingAccount("K981239812938nv", 1500, 5);

		savings.deposit(200);
		savings.withdraw(700);
		savings.withdraw(400);

		checking.deposit(500);
		checking.withdraw(100);
		checking.withdraw(2000);

	}

}
