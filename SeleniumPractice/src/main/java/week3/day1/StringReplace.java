package week3.day1;

public class StringReplace {
	public static void main(String[] args) {
		String sentence = "I am working with Java8";
		System.out.println(sentence.replace("8", "11"));
		System.out.println(sentence.concat("#"));
		System.out.println(sentence.subSequence(5, 14));
	}

}