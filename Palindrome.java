package Week1.day2;

public class Palindrome {
	
	public static void main(String[] args) {
		// Declare A String value as"madam"
		String str = "madam";
		// Declare another String rev value as ""
		String rev = "";
		int length = str.length() - 1;
		System.out.println("Length : " + length);
		// Iterate over the String in reverse order
		for (int i = length; i >= 0; i--) {
			// Add the char into rev
			rev = rev + str.charAt(i);
		}
//Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		if (str.equals(rev)) {
			System.out.println("The given String is palindrome");
		}
	}


}
