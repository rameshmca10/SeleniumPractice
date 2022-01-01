package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		Set<Integer> ls1 = new TreeSet<Integer>();
		for (Integer integer : data) {
			ls1.add(integer);
		}
		int len = ls1.size() - 2;
		int len1 = 0;
		for (Integer integer1 : ls1) {
			if (len1 == len) {
				System.out.println(integer1);
			}
			len1++;
		}
	}
}