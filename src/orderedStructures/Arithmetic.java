package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		if (!this.calledFirstValue){
			throw new IllegalStateException();
		}
		
		current = current + commonDifference; 
		return current;
	}

	public String toString(){
		return "Arith("+this.firstValue()+","+this.commonDifference+")";
	}

	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException {
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
		
	return (this.firstValue() + (n-1)*this.commonDifference);

		
	}
	
	public boolean Equals(Object o){
		Arithmetic p = Arithmetic.class.cast(o);
		
		if(this.firstValue() == p.firstValue() && this.commonDifference == p.commonDifference){
			return true;
		}
		return false;
	}

	@Override
	public Progression add(Progression other) {
			
		Progression newP = new Arithmetic((this.firstValue()+other.firstValue()),(this.commonDifference + ((Arithmetic) other).commonDifference ));

		return newP;
	}

	@Override
	public Progression substract(Progression other) {

		Progression newP = new Arithmetic((this.firstValue()-other.firstValue()),(this.commonDifference - ((Arithmetic) other).commonDifference ));

		return newP;
	}
	
	
}
