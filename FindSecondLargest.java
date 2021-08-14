package Week1.day2;

import java.util.Arrays;

public class FindSecondLargest {
	public static void main(String[] args) {
		// Here is the input
		int[] data = { 3, 2, 11, 4, 6, 7 };
		int secElement;

		/*
		 * Pseudo Code: 1) Arrange the array in ascending order 2) Pick the 2nd element
		 * from the last and print it
		 */

		Arrays.sort(data);
		secElement = data.length - 2;
		System.out.println("Second largest element is : " + data[secElement]);

	}

}
