package StringBuilder;

public class Main {
	public static void main(String[] args) {
		// String builder - изменяется, например удалить что-то; а с обычным String это невозмонжно
//		String s = "Hello";
//		String s2 = s.concat("World");
//		System.out.println(s2);
		
		// добавляет в конец строки
//		StringBuilder sBuilder = new StringBuilder("Hello");
//		sBuilder.append("world");
//		System.out.println(sBuilder); 
		
		// вставляет текст в указанную позицию
//		StringBuilder sBuilder2 = new StringBuilder("hello  world");
//		sBuilder2.insert(6, "world");
//		System.out.println(sBuilder2);
		
		// заменяет часть текста
		StringBuilder sBuilder3 = new StringBuilder("good morning");
		sBuilder3.replace(7, 11, "evening");
		System.out.println(sBuilder3);
		
		// удаляет часть текста
//		StringBuilder sBuilder4 = new StringBuilder("good morning");
//		sBuilder4.delete(0,7);
//		System.out.println(sBuilder4);
		
		// переворачивает строку
//		StringBuilder sBuilder5 = new StringBuilder("java");
//		sBuilder5.reverse();
//		System.out.println(sBuilder5);
		
//		StringBuilder sBuilder6 = new StringBuilder("привет");
		// назначаем длину
//		sBuilder6.setLength(3);
//		System.out.println(sBuilder6.length());
		// возвращаем символ по индексу
//		char ch = sBuilder6.charAt(1);
//		System.out.println(ch);
		
		// возвращаем часть строки
//		StringBuilder StringBuilder = new stringBuilder("hello from baku");
//		System.out.println(StringBuilder.substring((int) 7.10));
	}
}
