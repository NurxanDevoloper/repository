package Lesson40;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
//		Calculator addCalculator = (a, b) -> a + b;
//		Calculator subsctractCalculator = (a, b) -> a;

//		Calculator multiply = (a, b) -> a * b;		
//		Calculator idk = (a, b) -> a % b;
		
//		System.out.println(addCalculator.calculate(3,6));
//		System.out.println(subsctractCalculator.calculate(4,6));
		
		// проверят true или false
//		Predicate<Integer> isEven = a -> a>10;
		// метод predicate (test)
//		System.out.println(isEven.test(5));
		
		// принимает переменную типа T и возвра Boolean(true,flse)
//		Predicate<String> idk = a-> a.length() > 5;
//		System.out.println(idk.test("Hello ooooooo"));
		
		// 1) string - принимает integer - возвращает 
//		Function<String, Integer> lenghtFunction = str->str.length();
//		System.out.println(lenghtFunction.apply("Hello"));
	
//		Function<String, String> otherFunction = str->str.toUpperCase();
//		String aString = otherFunction.apply("Hello");
//		System.out.println(aString);
		
		// принимает переменную типа Т и не возвр
		// Consumer нечего не возвращает
//		Consumer<String> printer = str -> System.err.println(str);
//		printer.accept("Hello");
		
//		Consumer<Integer> printer2 = str -> System.out.println(str);
//		printer2.accept(5);
		
		// нечего не принимает, но возвращает пользователю какое-то значение(элемент)
		Supplier<Double> randomSupplier = ()->Math.random();
		System.out.println(randomSupplier.get());
	}

}
