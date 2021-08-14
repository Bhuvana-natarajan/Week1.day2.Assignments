package Week1.day2;

public class CharOccurance {
	
	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai";

		// declare and initialize a variable count to store the number of occurrences
		int var = 0;
		// convert the string into char array
		char[] charArray = str.toCharArray();

		// get the length of the array
		
		// traverse from 0 till the array length
		for (int i = 0; i < charArray.length; i++) {

			for (int j = i + 1; j < charArray.length; j++) {
				
		// Check the char array has the particular char in it
				if (charArray[i] == charArray[j]) {
					// if is has increment the count
					var = var + 1;
				}

			}

		}
		System.out.println("Total number of duplicates in string " + str + " is: " + var);

		// print the count out of the loop

	}

}
