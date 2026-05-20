package javacollection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Marks {
	public static void main(String[] args) {

		Map<String, List<Integer>> subjects = new HashMap<>();
		subjects.put("Math", List.of(99, 89, 90));
		subjects.put("Science", List.of(99, 89, 90));

		for (String key : subjects.keySet()) {
			List<Integer> scoreList = subjects.get(key);

			// 1. Calculate Total
			int total = 0;
			for (int score : scoreList) {
				total += score;
			}

			// 2. Calculate Percentage
			int maxPossibleMarks = scoreList.size() * 100;
			double percentage = ((double) total / maxPossibleMarks) * 100;

			// 3. Remarks
			String remarks = percentage > 90 ? "A+" : "Not sufficient for A+";

			// Output
			System.out.println("Key Set/ Subjects : "+ subjects.keySet());
			System.out.println("Subject : " + key);
			System.out.println("Scores : "+ scoreList);
			System.out.println("Total Marks : " + total);
			System.out.println("Percentage : " + percentage);
			System.out.println("Remarks : " + remarks);
			System.out.println();
		}
	}
}
