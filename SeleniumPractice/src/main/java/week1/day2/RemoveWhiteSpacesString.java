package week1.day2;

public class RemoveWhiteSpacesString {

	public static void main(String[] args) {
		String str = "India is my country";
		System.out.println("Original String: " + str);
		String noSpaceStr = str.replaceAll("\\s", "");
		System.out.println("After removing spaces using replaceAll: " + noSpaceStr);
		System.out.println("After removing spaces using char array and string buffer: " + removeSpaces(str));
	}

	static String removeSpaces(String string) {
		char[] charry = string.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < charry.length; i++) {
			if ((charry[i] != ' ') && (charry[i] != '\t'))
				sb.append(charry[i]);
		}
		return sb.toString();
	}

}