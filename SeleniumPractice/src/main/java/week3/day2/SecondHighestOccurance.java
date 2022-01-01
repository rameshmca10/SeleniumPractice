package week3.day2;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SecondHighestOccurance {

	public static void main(String[] args) {
		String input = "paypal India";
		Map<Character, Integer> map1 = new TreeMap<Character, Integer>();
		char[] char1 = input.toCharArray();
		for (char c : char1) {
			if (map1.containsKey(c)) {
				map1.put(c, map1.get(c) + 1);
			} else {
				map1.put(c, 1);
			}
		}
		System.out.println(map1);
		int len = map1.size() - 2;
		int len1 = 0;
		Set<Entry<Character, Integer>> entrySet = map1.entrySet();
		for (Entry<Character, Integer> integer1 : entrySet) {
			if (len == len1) {
				System.out.println(integer1);
			}
			len1++;
		}
	}
}