package java2prj2;

import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;

public class ForEachExample3 {
	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Alice", 85);
		scores.put("Bob", 92);
		scores.put("Charlie", 78);
		scores.put("Dangel", 90);
		scores.put("Ethan", 94);

		scores.forEach((name, score) -> System.out.println(name + ": " + score));
	}
}
