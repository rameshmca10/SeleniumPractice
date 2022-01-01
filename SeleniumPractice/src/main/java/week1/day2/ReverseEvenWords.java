package week1.day2;

public class ReverseEvenWords {

	// Build a logic to reverse the even position words (output: I ma a erawtfos
	// tester)

	/*
	 * Pseudo Code:
	 * 
	 * Declare the input as Follow String test = "I am a software tester"; a) split
	 * the words and have it in an array b) Traverse through each word (using loop)
	 * c) find the odd index within the loop (use mod operator)
	 * 
	 * d)split the words and have it in an array
	 * 
	 * e)print the even position words in reverse order using another loop (nested
	 * loop) f) Convert words to character array if the position is even else print
	 * the word as it is(concatenate space at the end).
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String test = "I am a software tester";
		System.out.println("Original String: " + test);
		String tests[] = test.split(" ");
		String changed = "";
		int i = 1;

		while (i < tests.length) {
			String temp = tests[i];
			String rev = "";
			char[] charr = temp.toCharArray();

			for (int j = charr.length - 1; j >= 0; j--)
				rev = rev + charr[j];

			tests[i] = rev;
			i = i + 2;
		}
		for (int k = 0; k < tests.length; k++)
			changed = changed + tests[k] + " ";
		System.out.println("Even Position Reversed String: " + changed.trim());
	}
}