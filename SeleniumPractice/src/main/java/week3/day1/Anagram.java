package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String st1 = "keep";
		String st2 = "Madam";
		st1.toLowerCase();
		st2.toLowerCase();
		char[] charArray1 = st1.toCharArray();
		char[] charArray2 = st2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println(st1 + " and " + st2 + " are anagrams");
		} else {
			System.out.println(st1 + " and " + st2 + " are not anagrams");
		}
	}
}