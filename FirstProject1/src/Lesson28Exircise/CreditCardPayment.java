package Lesson28Exircise;

public class CreditCardPayment implements Payment{
	@Override
	public void pay() {
		System.out.println("*Оплата картой на сумму: *");
	}
	
	@Override
	public void refund() {
		System.out.println("*Оплата через Кредитную карту на сумму *");
	}

	@Override
	public void pay(double amount) {
		//
	}

	@Override
	public void refund(double amount) {
		//
	}
}
