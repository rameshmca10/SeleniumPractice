package week1.day2;

import java.util.HashMap;
import java.util.Map;

public class WordsandOccurences {

	public static void main(String[] args) {
		String str = " This is a program to find duplicate words in a string, This is again a program";

		String[] words = str.toLowerCase().trim().split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String st : words) {
			if (map.containsKey(st))
				map.put(st, map.get(st) + 1);
			else
				map.put(st, 1);
		}
		System.out.println("Duplicate words in String: " + str);

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			int val = (Integer) m.getValue();
			if (val > 1)
				System.out.println(m);
		}
	}

}