package easy.algorithms;

import java.util.HashSet;
import java.util.Set;

public class Problem1 {

	public static void MultiplesOf3and5 (){
	    //If we list all the natural numbers below 10 that are 
		//multiples of 3 or 5,we get 3, 5, 6 and 9. The sum of these multiples is 23.
		//Find the sum of all the multiples of 3 or 5 below 1000.	
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 1000; i++ ) 
		{
			 //find a multiple of 3 and 5 first 
		     if (i % 3 == 0) { set.add(i); }	     
		     if (i % 5 == 0) { set.add(i); }		     
		}		
	    //now sum them up 
		int total = 0; 
		for (Integer multiple : set)
		{
			 total += multiple;  
		}
	      System.out.println("Total Summation of mutiples of 3 and 5: " + total );	
	}
	
}
