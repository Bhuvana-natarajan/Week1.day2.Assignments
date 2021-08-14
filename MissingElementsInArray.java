package Week1.day2;
import java.util.Arrays;

public class MissingElementsInArray {
	
	public static void main(String[] args) {
		// Here is the input
		int[] arr = { 0, 1, 2, 3, 4, 6, 7, 8 };
		// Sort the array
		Arrays.sort(arr);
		System.out.println("Sorted Array");

		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < arr.length - 1; i++) {

			// check if the iterator variable is not equal to the array values respectively
			if (arr[i] != i) { // print the number
				System.out.println("Missing number in array is : " + i);
				// once printed break the iteration
				break;
			}

		}

	}


}
