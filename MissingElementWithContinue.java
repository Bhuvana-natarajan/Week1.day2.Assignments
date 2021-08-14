package Week1.day2;

import java.util.Arrays;

public class MissingElementWithContinue {
	
public static void main(String[] args) {
		
		int[] arr = { 0, 1, 6, 8, 10 };
		int j=0;
			// Sort the array
			Arrays.sort(arr);
			System.out.println("Sorted Array");

			// loop through the array (start i from arr[0] till the length of the array)
			for (int i = 0; i <= 4; i++) {
				System.out.println("print j" +j);
				// check if the iterator variable is not equal to the array values respectively
				if (arr[j] != i) { // print the number
					System.out.println("Missing number in array is : " + i);
					// once printed break the iteration
					j=i;
					System.out.println(i + " and " +j);
					continue;
				}
				j=j+1;

			}
		
	}
	
	

}
