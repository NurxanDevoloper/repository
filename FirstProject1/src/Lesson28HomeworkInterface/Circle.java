package Lesson28HomeworkInterface;

public class Circle implements Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public void area() {
		System.out.println(radius *  radius * 3);
	}

	@Override
	public void area(double area) {
		System.out.println("**");
	}

	@Override
	public void perimeter(double perimeter) {
		System.out.println("**");
	}
}
