package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int i, fact = 1, number = 6;
		for (i = 1; i <= number; i++)
			fact = fact * i;
		System.out.println("Factorial of " + number + " using loop is: " + fact);
		System.out.println("Factorial of " + number + " using recursion is: " + factorial(number));
	}

	static int factorial(int n) {

		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}

}