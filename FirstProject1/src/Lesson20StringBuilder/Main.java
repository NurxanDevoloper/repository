package Lesson20StringBuilder;

public class Main {

	public static void main(String[] args) {
		// добавляет в конец строки
		StringBuilder sBuilder = new StringBuilder("Java is awesome ");
		sBuilder.append("Programming");
		System.out.println(sBuilder); 
		// заменяет часть текста
		StringBuilder sBuilder2 = new StringBuilder("Java is awesome Programming");
		sBuilder2.replace(8, 15, "fantastic"); 
		System.out.println(sBuilder2);
		// вставляет текст в указанную позицию
		StringBuilder sBuilder3 = new StringBuilder("Java is awesome Programming");
		sBuilder3.insert(0, "I think ");
		System.out.println(sBuilder3);
		// переворачивает строку
		StringBuilder sBuilder4 = new StringBuilder("Java is awesome Programming");
		sBuilder4.reverse();
		System.out.println(sBuilder4);
		// удаляет часть текста
		StringBuilder sBuilder5 = new StringBuilder("Java is awesome Programming");
		sBuilder5.delete(0,4);
		System.out.println(sBuilder5);
	}

}
