package week1.day1;

public class ReverseNumber {

	public static void main(String[] args) {
		int original = 258;
		int reversed = 0;
		int rem = 0;

		System.out.println(" Original Number: " + original);

		while (original > 0) {
			rem = original % 10;
			reversed = reversed * 10 + rem;
			original = original / 10;
		}

		System.out.println(" Reversed Number: " + reversed);
	}
}
