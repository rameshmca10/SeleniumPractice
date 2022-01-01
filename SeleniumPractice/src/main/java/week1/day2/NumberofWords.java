package week1.day2;

public class NumberofWords {

	public static void main(String[] args) {
		String str = " a";

		if (str.trim() == null || str.trim().isEmpty())
			System.out.println(0);
		else
			System.out.println(str.trim().split("\\s+").length);
	}

}