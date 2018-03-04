package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Fibonacci;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class ProgressionTester1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Progression p; 
		Progression p2; 
	
		
		System.out.println("Testing Fibonaci:"); 
		p = new Fibonacci(); 
		p.printAllTerms(20);
		
		p2 = new Fibonacci(3); 		
	    p = ((Fibonacci) p).add(p2);	
		System.out.println("\n\n\nTesting Fibonaci After Adding another Fibonacci:"); 
		p.printAllTerms(20);
		
		
		
		System.out.println("\n\n\nTesting Geometric:"); 
		p = new Geometric(2, 3); 
		p.printAllTerms(20);
		
		p2 = new Geometric(3, 2); 		
	    p = ((Geometric) p).add(p2);	
		System.out.println("\n\n\nTesting Geometric After Adding another Geometric:"); 
		p.printAllTerms(20);
		
		
		System.out.println("\n\n\nTesting Arithmetic:"); 
		p = new Arithmetic(2, 3); 
		p.printAllTerms(20);
		
		p2 = new Arithmetic(3, 2); 
	    p = ((Arithmetic) p).add(p2);	
		System.out.println("\n\n\nTesting Arithmetic After Adding another Arithmetic:"); 
		p.printAllTerms(20);
		
		
	}

}
