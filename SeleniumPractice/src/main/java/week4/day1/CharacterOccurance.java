package week4.day1;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

//	Assignment : Map
//	Write a Java Program to Find the Occurance of Each Character in the given String : "welcome to Selenium automation"
//	

	public static void main(String[] args) {

//		PseudoCode:
//			1. Create a String with your name as value

		String name = "ramesh Am ra";

//		2. Convert the string into a char array

		char[] arr = name.toCharArray();

//		3. Create an empty Map<Character,Integer>

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		int i = 0;

//		4. Iterate over the array

		for (i = 0; i < arr.length; i++)

			if (arr[i] != ' ')

//		5. Save the Character as key and iterator(i) as value
				map.put(arr[i], 0);

//		6. Check whether the Map contains the Character

		for (i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {

//		7. If it contains then increment the key (+1)

				map.put(arr[i], map.get(arr[i]) + 1);

//		8. Add the character in the map & set the value as 1
			}
		}
//		9. Print the Map
		System.out.println(map.toString());

	}

}