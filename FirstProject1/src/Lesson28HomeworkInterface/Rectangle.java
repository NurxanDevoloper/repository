package Lesson28HomeworkInterface;

public class Rectangle implements Shape{
	private double lenght;
	private double height;
	
	public Rectangle(double lenght, double height) {
		this.lenght = lenght;
		this.height = height;
	}
	@Override
	public void area() {
		System.out.println("* *");
	}

	@Override
	public void area(double area) {
		System.out.println("");
	}

	@Override
	public void perimeter(double perimeter) {
		System.out.println("");
	}
}