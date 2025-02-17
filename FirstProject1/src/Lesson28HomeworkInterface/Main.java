package Lesson28HomeworkInterface;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(10,15);
		
		circle.area();
		circle.area(2);
		circle.perimeter(25);
		
		rectangle.area();
		rectangle.area(64);
		rectangle.perimeter(15);
	}

}
