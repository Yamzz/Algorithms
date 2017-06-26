package easy.algorithms;

public class Problem4 {
	
	public static void LargestPalindromeProduct ()
	{	
		//A palindromic number reads the same both ways. 
		//The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
		//Find the largest palindrome made from the product of two 3-digit numbers.
		
		//largest palindrome number
		//product of two three digit numbers 
		//because 999 * 999 = 998,001 
		//we know that our palindrome product will be less than 1,000000	
		long oneMillion = 998001, largestPalindrome = 0, result = 0; 	

			for (long left = 999 ; left >= 100; left--)
			{
				for (long right = 999; right >= 100 ; right--)
				{
					//array_type array_element = array[i];
					 result= left * right; 
					 System.out.println("Answer is : " + left + " * " + right + " = " + result ); 
					 if (result == getPalindromeNumber(result) && result < oneMillion)
					 {
						 System.out.println("Palindrome Found : " + result);
						  if (result > largestPalindrome) {
							  largestPalindrome = result; 
						  } 		 
						 break; 
					 };		     
				}		
			}
			 System.out.println("Max Palindrome Found is : " + largestPalindrome);
	}
	
	
	public static long getPalindromeNumber(long num) {
		 long reveserNumber = 0, reminder;
		 while (num > 0)
		 {
		      reminder = num % 10;
		      reveserNumber = reveserNumber * 10 + reminder;
		      num = num / 10;
		 }
		 return reveserNumber; 
	}
	
	
}
