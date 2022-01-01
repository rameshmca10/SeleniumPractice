package week1.day1;

public class Fibonacci {
	public static void main(String[] args) {
		int N = 12;
		int num1 = 0, num2 = 1, sum = 0;

		System.out.println("Fibonacci series using for loop:");
		System.out.print(num1 + " " + num2 + " ");
		for (int i = 1; i <= N - 2; i++) {
			sum = num1 + num2;
			System.out.print(sum+" ");
			num1 = num2;
			num2 = sum;
		}

		System.out.println("\n\nFibonacci series using recursion:");
		for (int i = 0; i < N; i++)
			System.out.print(fib(i) + " ");
	}

	static int fib(int n) {
		if (n <= 1)
			return n;
		else
			return (fib(n - 1) + fib(n - 2));
	}
}