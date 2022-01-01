package week1.day2;

public class StringReverse {

	public static void main(String[] args) {
		String str = "hello there";
		StringBuffer strbf = new StringBuffer(str);
		StringBuilder strbl = new StringBuilder(str);
		System.out.println("Using Char Array: " + arr(str));
		System.out.println("Using String Buffer: " + strbf.reverse().toString());
		System.out.println("Using String Builder: " + strbl.reverse().toString());
	}

	static String arr(String str) {
		String rev = "";
		char[] charr = str.toCharArray();
		for (int i = charr.length-1; i >= 0; i--)
			rev = rev + charr[i];
		return rev;
	}

}