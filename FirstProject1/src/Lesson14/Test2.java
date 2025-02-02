package Lesson14;
//два метода один для умножение двух чисел
//другой для проверки на четность
public class Test2 {

	public static void main(String[] args) {

		Test2 obj = new Test2();
		System.out.println(obj.umnoj(5, 3));
		obj.isEven(6);
		obj.isEven(10);
	}

	public static int umnoj(int a, int b) {
		int result = a * b;
		return result;

	}
	public void isEven(int a) {
		if (a%2==0) {
			System.out.println("четное");
		}else {
			System.out.println("нечетное");
		}
	}
		
	}


