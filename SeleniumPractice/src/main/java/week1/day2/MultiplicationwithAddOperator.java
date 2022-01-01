package week1.day2;

public class MultiplicationwithAddOperator {

	public static void main(String[] args) {
		int a = 5, b = 6, sum = 0;

		for (int i = 1; i <= a; i++)
			sum = sum + b;

		System.out.println(a + "x" + b + "=" + sum);
	}
}