package Order;

import Lesson22.main3;

public class OrderMain {
	public static void main(String[] args) {
		OrderClass order1 = new OrderClass(1, "Пицца Маргарита", true);
		OrderClass order2 = new OrderClass(2, "Суши сет", false);
		OrderClass order3 = new OrderClass(3, "Бургер Классик", true);
		
		order3.completeOrder();
		
		System.out.println(order1);
		System.out.println(order2);
		System.out.println(order3);
	
	
	}
}
