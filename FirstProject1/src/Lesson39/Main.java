package Lesson39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSOutput;

public class Main {

	public static void main(String[] args) {
		String[] nameStrings = {"Emil", "Aylin", "Nurhan"};
		for (String string : nameStrings) {
			System.out.println(string);
		}
		
		
		
		List<String> nameList = new ArrayList<String>();
		nameList.add("Emil");
		nameList.add("Nurhan");
		nameList.add("Aylin");
		nameList.add("Elvin");

		// 1) Преобразование массива в список(List)
		String[] nameStrings2 = {"Emil", "Aylin", "Nurhan"};
		
		List<String> nameList2 = new ArrayList<>(Arrays.asList(nameStrings2));
		System.out.println(nameList2);
		
		
		
		// 2) Преобразование списка(List) в массив
		List<String> nameList3 = new ArrayList<String>();
		nameList3.add("Elvin");
		nameList3.add("Nara");
		nameList3.add("Meleyke");
		
		String[] nameArray = nameList3.toArray(new String[0]);
		
		for (String s : nameArray) {
			System.out.println(nameArray);
		}
		
		List<String> names = new ArrayList<String>();
		names.add("Emil");
		names.add("Nurhan");
		names.add("Aylin");
		
		names.forEach(n->System.out.println(n));
		
		// stream api
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		numbers.add(10);
		// collect = собирает числа
//		System.out.println(numbers);
//		List<Integer> evenNumbers = numbers.stream().filter(n->n % 2 == 0).collect(Collectors.toList());
//		System.out.println(evenNumbers);
		
		// map - проходит по всему листу
		List<Integer> doubledNumbers = numbers.stream().map(s->s*2).collect(Collectors.toList());
		System.out.println(doubledNumbers);
		
		
		List<Integer> newNumbers = numbers.stream().filter(a->a%2==1).map(s->s*3).collect(Collectors.toList());
		System.out.println(newNumbers);
		
	}
// ( )  -> {}
}
