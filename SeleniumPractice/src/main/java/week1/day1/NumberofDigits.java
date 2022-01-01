package week1.day1;

public class NumberofDigits {
	public static void main(String[] args) {

		int num = 5876, count = 0;
		int temp = num;

		while (temp != 0) {
			temp = temp / 10;
			count++;
		}

		System.out.println("Number of digits in " + num + " are " + count);

	}
}