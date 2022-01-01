package week1.day2;

public class ChangeOddIndexToUpperCase {
	/*
	 * Pseudo Code
	 * 
	 * Declare String Input as Follow
	 * 
	 * String test = "changeme";
	 * 
	 * a) Convert the String to character array
	 * 
	 * b) Traverse through each character (using loop)
	 * 
	 * c)find the odd index within the loop (use mod operator)
	 * 
	 * d)within the loop, change the character to uppercase, if the index is odd
	 * else don't change
	 * 
	 */

	public static void main(String[] args) {
		String test = "changeme";
		System.out.println("Original String: " + test);
		char tests[] = test.toCharArray();
		String changed = "";
		int i = 0;

		while (i < tests.length) {
			char temp = tests[i];

			tests[i] = Character.toUpperCase(temp);

			i = i + 2;

		}
		for (int k = 0; k < tests.length; k++)
			changed = changed + tests[k];
		System.out.println("Odd Position UPPER Character: " + changed);
	}
}