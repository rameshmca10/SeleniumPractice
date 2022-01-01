package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		HashSet<String> hashSet = new LinkedHashSet<String>();
		String[] text1 = text.split(" ");

		System.out.println("String Original: " + text);

		for (String string : text1)
			hashSet.add(string);

		System.out.print("String after removing duplicates: ");

		for (String string1 : hashSet)
			System.out.print(string1 + " ");

	}
}