package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	public Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() {
        // add the necessary code here
		if (!this.calledFirstValue){
			throw new IllegalStateException();
		}
		double orignalValue = prev;
				prev = current;
		current += orignalValue;

	
		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
	}

	@Override
	public Progression add(Progression other) {
			
		Progression newP = new Fibonacci((this.firstValue()+other.firstValue()));

		return newP;
	}

	@Override
	public Progression substract(Progression other) {

		Progression newP = new Fibonacci((this.firstValue()-other.firstValue()));
		return newP;
	}
	
}
