package Lesson15Homework;

public class MyСlass {
	  {
	        System.out.println("Объект создан");
	    }
	  
	  public MyСlass() {
	        System.out.println("Конструктор вызван");
	    }

	    public static void main(String[] args) {
	        System.out.println("первый объект");
	        MyСlass obj1 = new MyСlass();

	        System.out.println("второй объект");
	        MyСlass obj2 = new MyСlass();
	    }
}
