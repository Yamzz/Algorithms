package easy.algorithms;

public class Problem6 {

	public void SumSquareDifference () 
	{
		//The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ... + 10^2 = 385
		//The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10)2 = 552 = 3025
		//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
		//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
		int limit = 100, square = 0, totalSumOfSquares = 0, totalSum = 0, 
		totalSqaureOfSum = 0, difference = 0; 
		
		//sum of first 100 natural numbers are 
		for (int i = 1; i<= limit; i++)
		{
			square = i*i; 
			totalSumOfSquares += square; 
			totalSum += i; 
		}
		totalSqaureOfSum = totalSum * totalSum;  
		difference = totalSqaureOfSum - totalSumOfSquares; 	
		System.out.println("Total Sum of Square = " + totalSumOfSquares);
		System.out.println("Total Square of Sum = " + totalSqaureOfSum);
		System.out.println("Diffrence between is = " + difference);
	}
	
}
