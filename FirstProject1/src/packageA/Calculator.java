package packageA;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	protected int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	private int divide(int a, int b) {
		if (b == 0) {
			System.out.println("Division by zero is not allowed.");
			return 0;
		}
		return a / b;
	}

	public int publicDivide(int a, int b) {
		return divide(a, b);
	}

}
