package javacollection;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapTest {
	public static void main(String[] args) {
		// subject - marks
//		Map<String, Integer> map = new HashMap<>();
//		Map<String, Integer> map = new TreeMap<>();
		Map<String, Integer> map = new LinkedHashMap<>();

		map.put("Math", 89);
		map.put("Science", 88);
		map.put("Nepali", 99);
		map.put("Java", 77);

		System.out.println(map);
		System.out.println("Map Size : " + map.size());
		System.out.println("Map Keys : " + map.keySet());
		System.out.println("Map Values : " + map.values());

		String remove_subject = (map.containsKey("Science")) ? "Science" : "Nothing";
		System.out.println("Removed " + remove_subject);
		map.remove("Science");
		
		for (String key : map.keySet()) {
			System.out.println(key + " = " + map.get(key));
		}
	}
}
