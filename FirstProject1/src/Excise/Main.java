package Excise;

import Lesson25Homework_2.Car;

public class Main {
	public static void main(String[] args) {
		Car car1 = new Car("Toyota", "Corolla", 2019);
		Car car2 = new Car("Bmw", "M5", 2020);
		Car car3 = new Car("Zeekr", "Xusano", 2021);
		car1.displayCarInfo();
		car2.displayCarInfo();
		car3.displayCarInfo();
		
		System.out.println(car1.toString());
		
		 Car[] cars = {car1, car2, car3};

	        for (Car car : cars) {
	            car.displayCarInfo();
	        }
	}
        
	@Override
	public String toString() {
		return "Main []";
	}
}
