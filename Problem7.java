package easy.algorithms;

public class Problem7 {

	/**
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	 * What is the 10001st prime number?
	 */
	public static void OneThousandOnePrime()
	{
		int counter = 0, oneThousandOne = 10001  ; 
		for (int i = 0; counter <= oneThousandOne; i++)
		{
			    if (isPrime(i)) {
			    	counter++; 
			    	System.out.println("Count : " + counter + " Prime : " + i); 
			    }
		}	
	}
	
	public static boolean isPrime(long n)
	{
		 if (n == 0 || n ==1) return false; 
	    //check if n is a multiple of 2
	    if (n > 2  && (n & 1) == 0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	
}
