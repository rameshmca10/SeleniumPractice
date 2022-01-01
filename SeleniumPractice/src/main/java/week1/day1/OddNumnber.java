package week1.day1;

public class OddNumnber {

	public static void main(String[] args) {
		int a[] = { 2, 8, 7, 5, 9, 6, 3 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.println(a[i] + " is Even Number");
			else
				System.out.println(a[i] + " is Odd Number");
		}
	}

}