package week1.day2;

public class RemoveDuplicates {

	/*
	 * Pseudo code
	 * 
	 * a) Use the declared String text as input String text =
	 * "We learn java basics as part of java sessions in java week1"; b) Initialize
	 * an integer variable as count c) Split the String into array and iterate over
	 * it d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. f) if the count > 1 then
	 * replace the word as ""
	 * 
	 * g) Displaying the String without duplicate words
	 */
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String text1[] = text.split(" ");
		String text2 = "";
		for (int i = 0; i < text1.length - 1; i++) {
			for (int j = 1; j < text1.length - 1; j++) {
				if (text1[i] == text1[j])
					count += 1;
			}
			if (count > 1)
				text2 = text.replace(text1[i] + " ", "");
		}
		System.out.println(text2);

	}
}