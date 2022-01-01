package week3.day1;

import java.util.Arrays;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String val = "";
		String val1 = "";
		String value = "";
		String test = "I am a software tester";
		String[] t = test.split(" ");
		System.out.println(Arrays.toString(t));
		int arr = t.length;
		System.out.println(arr);
		for (int i = 0; i < t.length; i += 2) {
			for (int j = 1; j < t.length; j += 2)

			{
				val1 = (t[j]);
				value = new StringBuilder(val1).reverse().toString();

				System.out.print("*" + value);
			}
			val = t[i];
			String Test = val;
			System.out.print("," + Test);
		}

	}
}