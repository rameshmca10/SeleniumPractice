package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int letter = 0, space = 0, number = 0, specialChar = 0;

		// Build the logic to find the count of each
		/*
		 * Pseudo Code: a) Convert the String to character array b) Traverse through
		 * each character (using loop) c) Find if the given character is what type using
		 * (if) i) Character.isLetter ii) Character.isDigit iii)Character.isSpaceChar
		 * iv) else -> consider as special character
		 */
		char[] charray = test.toCharArray();

		for (int i = 0; i < charray.length; i++) {
			if ((Character.isLetter(charray[i])))
				letter = letter + 1;
			else if ((Character.isDigit(charray[i])))
				number = number + 1;
			else if ((Character.isSpaceChar(charray[i])))
				space = space + 1;
			else
				specialChar = specialChar + 1;
		}
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + number);
		System.out.println("specialCharcter: " + specialChar);
	}
}