package Lesson15Homework;

public class MathUtils {
	   static {
	        System.out.println("Программа началась");
	    }
	   
	   public static double Math(double num1, double num2, double num3) {
	        return (num1 + num2 + num3) / 3;
	    }

	    public static void main(String[] args) {
	        double average = MathUtils.Math(4.5, 7.2, 3.8);
	        System.out.println("Среднее значение: " + average);
	    }
	   
}
