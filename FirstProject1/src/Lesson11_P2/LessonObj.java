package Lesson11_P2;

public class LessonObj {

	public static void main(String[] args) {
//		// обьект 1
//		Lesson11Class car1 = new Lesson11Class();
//		car1.brand = "BMW";
//		car1.year = 2014;
//		car1.price = 55000;
//		// обьект 2
//		Lesson11Class car2 = new Lesson11Class();
//		car2.brand = "audi";
//		car2.year = 2016;
//		car2.price = 25000;
//
//		// обьект 3
//		Lesson11Class car3 = new Lesson11Class();
//		car3.brand = "mers";
//		car3.year = 2011;
//		car3.price = 8000;

		System.out.println("car 4");
		Lesson11Class car4 = new Lesson11Class("Hyundai", 2010, 30000);
		System.out.println(car4.brand);
		System.out.println(car4.year);
		System.out.println(car4.price);
		
		System.out.println("car 5");
		Lesson11Class car5 = new Lesson11Class("toyota", 2006, 25000);
		System.out.println(car5.brand);
		System.out.println(car5.year);
		System.out.println(car5.price);
		
		
	}

}
