package Lesson27AbstractHomework_2;

public class PayPalPayment extends Payment{
	@Override
    void pay(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}
