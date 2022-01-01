package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] arr = test.toCharArray();
		for (int i = 1; i <= arr.length; i += 2) {
			arr[i] = Character.toUpperCase(arr[i]);
		}
		String conStr = String.valueOf(arr);
		System.out.println(conStr);
	}
}