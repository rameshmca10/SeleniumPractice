package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingElementsInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Set<Integer> ls1 = new TreeSet<Integer>();
		for (Integer integer : arr) {
			ls1.add(integer);
		}
		int i = 1;
		for (int j = 0; j <= ls1.size() - 1; j++) {
			boolean b1 = ls1.add(i);
			if (b1 == true) {
				System.out.println(i);
				break;
			}
			i++;
		}
	}
}