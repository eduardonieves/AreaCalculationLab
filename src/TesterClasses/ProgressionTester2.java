package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class ProgressionTester2 {

	public static void main(String[] args) { 
		Progression p = new Arithmetic(3, 2); 
		// outputs the sum of first 5 terms in p
		printSumOfTerms(p, 5); 

		p = new Geometric(3, 2); 
		printSumOfTerms(p, 5); 
		
		//Testing the Equals Method, comment line 14 & 15,uncomment line 18 & 19 to test.
//		Progression p2 = new Arithmetic(3, 2); 
//		System.out.println(((Arithmetic) p).Equals(p2));
		
		//Testing the Equals Method, comment line 14 & 15,uncomment line 22 & 23 to test.
//		Progression p2 = new Geometric(3, 2); 
//		System.out.println(((Geometric) p).Equals(p2));
		
		
		
		
	} 

	/** Prints the sum of the first terms in a 
	    	      progression. 
			@param p the progression
			@param n the number of terms to consider
	 **/ 
	private static void printSumOfTerms(
			Progression p, int n) 
	{ 
		// pre: n is valid
//		... add code to compute, and assign to sum, the sum
//		    of the first n terms in p
		 double sum = 0;
		for(int i = 1; i <= n; i++ ){
				
		 sum = sum + p.getTerm(i);
		}
		
		System.out.println("Sum of first " + n + " terms in " 
				+ p + " is: " + sum); 
	}


}
