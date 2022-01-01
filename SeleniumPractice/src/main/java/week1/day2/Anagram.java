package week1.day2;

import java.util.Arrays;

public class Anagram {
	/*
	 * Pseudo Code
	 * 
	 * Declare a String String text1 = "stops"; Declare another String String text2
	 * = "potss"; a) Check length of the strings are same then (Use A Condition) b)
	 * Convert both Strings in to characters c) Sort Both the arrays d) Check both
	 * the arrays has same value
	 * 
	 */

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";

		if (text1.length() == text2.length()) {
			System.out.println("Both strings are same length: " + text1.length());
			char[] array1 = text1.toCharArray();
			Arrays.sort(array1);

			char[] array2 = text2.toCharArray();
			Arrays.sort(array2);
			boolean flag = true;
			System.out.println("Checking: "+flag);
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i])
					flag = false;
			}
			if (flag = true)
				System.out.println("Both arrays have same value: "+Arrays.toString(array1));
		} else
			System.out.println(
					"Both strings are different length: \ntext1-" + text1.length() + "\ntext2-" + text2.length());
	}
}