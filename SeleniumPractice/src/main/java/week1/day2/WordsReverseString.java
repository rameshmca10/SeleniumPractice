package week1.day2;

public class WordsReverseString {

	public static void main(String[] args) {
		String str = "hello i am ramesh";
		String[] strarr = str.split(" ");
		String reverseWords = "";
		for (String temp : strarr) {
			StringBuilder sb = new StringBuilder(temp);
			sb.reverse();
			reverseWords += sb.toString() + " ";
		}
		System.out.println(reverseWords.trim());
	}

}