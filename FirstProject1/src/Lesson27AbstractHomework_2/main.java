package Lesson27AbstractHomework_2;

public class main {

	public static void main(String[] args) {
		CreditCardPayment cardPayment = new CreditCardPayment();
		cardPayment.pay(300.50);
		
		
		PayPalPayment palPayment = new PayPalPayment();
		palPayment.pay(100.20);
	}

}
