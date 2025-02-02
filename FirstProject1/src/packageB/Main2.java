package packageB;

import packageA.Calculator;

public class Main2 {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println("Add: " + calc.add(5, 3));
		System.out.println("Multiply: " + calc.multiply(5, 3));
		System.out.println("Public Divide: " + calc.publicDivide(6, 3));
		System.out.println("Public Divide: " + calc.publicDivide(6, 3));

	}
}
