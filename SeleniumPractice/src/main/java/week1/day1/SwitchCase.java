package week1.day1;

public class SwitchCase {

	public static void main(String[] args) {
		int number1 = 9;
		int number2 = 4;
		int result;
		char operator = '%';
		switch (operator) {

		// performs addition between numbers
		case '+':
			result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;

		// performs subtraction between numbers
		case '-':
			result = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + result);
			break;

		// performs multiplication between numbers
		case '*':
			result = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + result);
			break;

		// performs division between numbers
		case '/':
			result = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = " + result);
			break;

		case '%':
			result = number1 % number2;
			System.out.println(number1 + " % " + number2 + " = " + result);
			break;

		default:
			System.out.println("Invalid operator!");
			break;
		}

	}

}
