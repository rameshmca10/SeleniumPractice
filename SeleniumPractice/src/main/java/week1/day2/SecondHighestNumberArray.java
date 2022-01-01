package week1.day2;

import java.util.Arrays;

public class SecondHighestNumberArray {
	public static void main(String[] args) {

		int arr[] = { 15, 54, 25, 87, 104, 578, 45 };
		Arrays.sort(arr);
		if (arr.length == 0)
			System.out.println("Array has no elements");
		else if (arr.length <= 1)
			System.out.println("Array has only one value");

		else if (arr.length == 2) {

			if (arr[0] == arr[1])
				System.out.println("Array has only 2 values and both are equal");
			else if ((arr[0] > arr[1]))
				System.out.println("Highest: " + arr[0] + "\nSecond Highest: " + arr[1]);
			else
				System.out.println("Highest: " + arr[1] + "\nSecond Highest: " + arr[0]);
		}

		else {
			for (int i = arr.length - 1; i > 0; i--) {
				if (arr[i] != arr[i - 1]) {
					System.out.println("Highest number is: " + arr[i]);
					System.out.println("Second highest number is: " + arr[i - 1]);
					return;
				}
			}
		}

	}

	static {

		int arr[] = { 15, 54, 25, 87, 104, 578, 45 };
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highest) {
				secondHighest = highest;
				highest = arr[i];
			} else if (arr[i] > secondHighest && arr[i] != highest)
				secondHighest = arr[i];
		}
		System.out.println("Without using Arrays.sort \nHighest number is: " + highest);
		System.out.println("Second highest number is: " + secondHighest + "\n");
	}
}