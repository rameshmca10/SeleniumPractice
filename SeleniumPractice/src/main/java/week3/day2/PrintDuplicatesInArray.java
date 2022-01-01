package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		Set<Integer> ls1 = new TreeSet<Integer>();
		for (Integer integer1 : arr) {
			boolean b1 = ls1.add(integer1);
			if (b1 == false) {
				System.out.println(integer1);
			}
		}

	}

}