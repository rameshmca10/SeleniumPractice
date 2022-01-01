package week1.day2;

public class LargestSmallestinArray {

	public static void main(String[] args) {
		int[] a = { 10, 7, 3, 4, 5 };
		int large, small;

		large = small = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > large)
				large = a[i];

			if (a[i] < small)
				small = a[i];
		}

		System.out.println("Smallest Element is: " + small);
		System.out.println("Largest Element is: " + large);
	}
}