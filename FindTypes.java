package Week1.day2;

public class FindTypes {
	
	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		char[] test2 = test.toCharArray();
		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each
		/*
		 * Pseudo Code: a) Convert the String to character array b) Traverse through
		 * each character (using loop) c) Find if the given character is what type using
		 * (if) i) Character.isLetter ii) Character.isDigit iii)Character.isSpaceChar
		 * iv) else -> consider as special character
		 */
		for (int i = 0; i < test2.length; i++) {

			if (Character.isLetter(test2[i])) {
				letter = letter + 1;
			} else if (Character.isDigit(test2[i])) {
				num = num + 1;
			} else if (Character.isSpaceChar(test2[i])) {
				space = space + 1;
			} else {
				specialChar = specialChar + 1;
			}
		}
	}
}
