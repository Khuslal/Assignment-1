package javacollection;

import java.util.Map;
import java.util.HashMap;
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
		
		for(String key : map.keySet()) {
			System.out.println(key+" = "+map.get(key));
		}
	}
}
