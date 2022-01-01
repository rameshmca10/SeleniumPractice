package week1.day2;

public class Polindrome {

	public static void main(String[] args) {
		int number = 2553552;
		int original = number;
		int reversed = 0;
		int rem = 0;

		while (original > 0) {
			rem = original % 10;
			reversed = reversed * 10 + rem;
			original = original / 10;
		}

		if (number == reversed)
			System.out.println(number + " is apolindrome number");
		else
			System.out.println(number + " is not apolindrome number");
	}
}