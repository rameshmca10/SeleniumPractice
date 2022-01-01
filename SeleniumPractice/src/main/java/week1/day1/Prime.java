package week1.day1;

public class Prime {

	public static void main(String[] args) {
		int num = 27;
		boolean flag = false;
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}

		}
		if (!flag)
			System.out.println(num + " is a Prime mnumnber");
		else
			System.out.println(num + " is not a Prime mnumnber");
	}

}
