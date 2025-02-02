package Lesson13;

public class Rectangle {

	int width;
	int height;
//Rectangle rec=new Rectangle()
	public Rectangle() {
		width = 1;
		height = 1;
	}
//Rectangle rec=new Rectangle(5)
	public Rectangle(int side) {
		width = side;
		height = side;
	}
//Rectangle rec=new Rectangle(5,10)
	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}

}
