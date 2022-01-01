package week3.day1;

public class Calculator {

	public void add(int a, int b) {
		System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
	}

	public void add(int a, int b, int c) {
		System.out.println("Sum of " + a + " and " + b + " and " + c + " is: " + (a + b + c));
	}

	public void multiply(int a, int b) {
		System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
	}

	public void multiply(int a, double b) {
		System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
	}

	public void subtract(int a, int b) {
		System.out.println("Minus of " + a + " and " + b + " is: " + (a - b));
	}

	public void subtract(double a, double b) {
		System.out.println("Minus of " + a + " and " + b + " is: " + (a - b));
	}

	public void divide(int a, int b) {
		System.out.println("Division of " + a + " and " + b + " is: " + (a / b));
	}

	public void divide(double a, int b) {
		System.out.println("Division of " + a + " and " + b + " is: " + (a / b));
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		calc.add(5, 6);
		calc.add(5, 8, 9);

		calc.multiply(5, 6);
		calc.multiply(5, 6.8);

		calc.subtract(45, 20);
		calc.subtract(45.8, 20.9);

		calc.divide(45, 20);
		calc.divide(45.8, 20);

	}
}