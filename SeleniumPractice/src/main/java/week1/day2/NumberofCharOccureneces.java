package week1.day2;

import java.util.HashMap;
import java.util.Map;

public class NumberofCharOccureneces {

	public static void main(String[] args) {
		String str = "helloareyouthere";
		char ch = 'e';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				count++;
		}
		System.out.println(ch + " in String" + str + " occured " + count + " times");
		System.out.println(ch + " in String" + str + " occured " + charmap(str, ch) + " times");
	}

	static int charmap(String str, char ch) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			else
				map.put(str.charAt(i), 1);
		}
		return map.get(ch);
	}
}