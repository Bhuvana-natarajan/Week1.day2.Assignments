package Week1.day2;

public class ReverseEvenWords {
	
	public static void main(String[] args) {

		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

				/* Pseudo Code:
				 
				 * Declare the input as Follow
			      		String test = "I am a software tester"; 
				a) split the words and have it in an array
				b) Traverse through each word (using loop)
				c) find the odd index within the loop (use mod operator)
				
				d)split the words and have it in an array
				
				e)print the even position words in reverse order using another loop (nested loop)
				f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
				
				 
			*/
		
		
		String test="Sandhya is a good girl";
		String[] splitStr = test.split(" ");
		String odd="";
		String even="";
		for (int i=0;i<splitStr.length;i++)
		{
			//System.out.println("After Split: "+splitStr[i]);
			if (i%2!=0)
			{
				char[] charStr=splitStr[i].toCharArray();
				
				for (int j=charStr.length-1;j>=0;j--)
				{
				
					odd=odd+charStr[j];
					
					
					//System.out.println(odd);
					
				}
				odd=odd.concat(" ");
				even=odd;
			}
			else {
			
				even=even+splitStr[i].concat(" ");
				odd=even;
				
	
			}		
			
		}
		
		System.out.println(even);
	}
	

}
