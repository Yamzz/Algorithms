package easy.algorithms;

public class Problem5 {

	public void SmallestMultiple()
	{
		//2520 is the smallest number that can be divided by each of the numbers 
		  //from 1 to 10 without any remainder.
	   //What is the smallest positive number that is 
		//evenly divisible by all of the numbers from 1 to 20?
		int currentSmallestMul = 0, currNumber = 20, counter = 20,temp = 0; 	
		int [] totalNumbers = new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};  
			while (currNumber % 20 == 0) 
			{
				for (int x : totalNumbers) {
					 if ( currNumber % x == 0){
						 temp = x; 
						 System.out.println("Current Number " + currNumber + " is a multiple of " + x); 
					 }
					 else {
						 break; 
					 }
				}
				 if (temp == 20 ){break;}
				 currNumber+=counter; 
			}			
		currentSmallestMul = currNumber;  
		System.out.println("Smallest Multiple = " + currentSmallestMul);		
	}
}
