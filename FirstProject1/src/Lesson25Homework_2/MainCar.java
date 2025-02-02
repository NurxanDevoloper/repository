package Lesson25Homework_2;

public class MainCar {
public static void main(String[] args) {
	Car car = new Car("Toyota", "Corolla", 2019);
	car.displayCarInfo();
	
	car.setYear(2023);
	System.out.println("Updated Year: " + car.getYear());
}
}
