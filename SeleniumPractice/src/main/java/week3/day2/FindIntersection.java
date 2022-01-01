package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		int[] a = { 3, 2, 11, 4, 6, 7 };
		int[] b = { 1, 2, 8, 4, 9, 7 };
		Set<Integer> ls1 = new LinkedHashSet<Integer>();
		Set<Integer> ls2 = new LinkedHashSet<Integer>();
		Set<Integer> ls3 = new LinkedHashSet<Integer>();
		for (Integer integer : a) {
			ls1.add(integer);
		}
		for (Integer integer1 : b) {
			ls2.add(integer1);
		}
		for (Integer integer3 : ls1) {
			boolean b1 = ls2.add(integer3);
			if (b1 == false) {
				ls3.add(integer3);
			}
		}
		
		System.out.print("Common elements: ");
		for (Integer integer4 : ls3) {
			System.out.print(integer4+" ");
		}
	}
}