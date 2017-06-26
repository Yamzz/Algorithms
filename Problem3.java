package easy.algorithms;

public class Problem3 {

	public void largestPrimeFactor ()
	{
		//The prime factors of 13195 are 5, 7, 13 and 29.
		//What is the largest prime factor of the number 600851475143 ?
		long Number = 600851475143L; 
		long i = 1L, total = 1L , temp =0L; 
		
		//first factors of a number 
		//then check if that number is prime 
		while(i <= Number) {
			if(Number % i == 0) {	
					temp = i; 
				    total = total * temp;
				    if (total == Number)
				    {
				    	System.out.format("\nTotal is " + total);	
				    	System.out.format("\nHighest Prime Factor is " + i);
				    	break; 
				    }
				System.out.format(" %d  ", i);
			}
			i++;
		}
		 	
	}
	
}
