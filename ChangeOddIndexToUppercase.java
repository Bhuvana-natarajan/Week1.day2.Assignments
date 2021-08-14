package Week1.day2;

public class ChangeOddIndexToUppercase {
	
	public static void main(String[] args) {
		String str = "changeme";
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {

				arr[i] = Character.toUpperCase(arr[i]);
		
			}
			System.out.println("After Change str: " + arr[i]);
		}

	}

}
