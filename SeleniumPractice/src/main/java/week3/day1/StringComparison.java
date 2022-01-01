package week3.day1;

public class StringComparison {

	public static void main(String[] args) {
		String str3 = new String("Kutty");
		String str4 = new String("Kutty");

		if (str3 == str4) {
			System.out.println("Same String Object");
		} else
			System.out.println("Diff String Object");

		System.out.println("***");

		if (str3.equals(str4)) {
			System.out.println("Same String text");
		} else
			System.out.println("Diff String text");

		System.out.println("***");

		String s1 = "I am Learning Java";
		String s2 = "I am learning java";

		if (s1 == s2)
			System.out.println("Same String Object");
		else
			System.out.println("Diff String Object");

		if (s1.equals(s2))
			System.out.println("Same String content and case");
		else
			System.out.println("Diff String");

		if (s1.equalsIgnoreCase(s2))
			System.out.println("Same String content ignoring case");
		else
			System.out.println("Diff String");
	}

}