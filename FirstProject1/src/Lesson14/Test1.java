package Lesson14;
//два метода один для умножение двух чисел
//другой для проверки на четность
public class Test1 {

	public static void main(String[] args) {

		Test1 test = new Test1();
		test.printMessage();
		test.printMessage();

		System.out.println(test.sayHello("Meleyke"));
		System.out.println(test.sum(5, 10));

	}
	public int sum(int a, int b) {
		int s = a + b;
		return s;
	}
	
	public void printMessage() {
		System.out.println("Hello world");
	}

	public String sayHello(String name) {
		String r = "hello " + name;
		return r;
	}
		
		
	}

