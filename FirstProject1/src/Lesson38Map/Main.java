package Lesson38Map;

import java.util.HashMap;
import java.util.Map;
//key=integer
//value=string
public class Main {

	public static void main(String[] args) {
//		Map<Integer, String> studentsMap = new HashMap<Integer, String>();
		// put - для получения в (Map) 
		//add - для получания в (List)
//		studentsMap.put(1, "Umud");
//		studentsMap.put(2, "Meleyke");
//		studentsMap.put(3, "Meleyke");
		
//		System.out.println(studentsMap.get(1));
		
		
		Map<String, Integer>  studentsMap2 = new HashMap<String, Integer>();
		studentsMap2.put("Umud", 15);
		studentsMap2.put("Aylin", 16);
		
		System.out.println(studentsMap2.get("Aylin"));
		System.out.println(studentsMap2);
		System.out.println(studentsMap2.remove("Aylin", studentsMap2));
		System.out.println(studentsMap2);
		System.out.println(studentsMap2);
		System.out.println(studentsMap2.containsKey("Aylin"));
		System.out.println(studentsMap2.containsValue(16));
	}

}
