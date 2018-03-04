package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		if (!this.calledFirstValue){
			throw new IllegalStateException();
		}
		current = current * commonFactor; 
		return current;
	}

	public String toString(){
		return "Geom("+this.firstValue()+","+this.commonFactor+")";
	}
	
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException {
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
		
	return this.firstValue() + Math.pow(this.commonFactor,n-1);
	
		
	}

	public boolean Equals(Object o) {
		Geometric p = Geometric.class.cast(o);
		
		if(this.firstValue() == p.firstValue() && this.commonFactor == p.commonFactor){
			return true;
		}
		return false;
	}
	
	@Override
	public Progression add(Progression other) {
			
		Progression newP = new Geometric((this.firstValue()+other.firstValue()),(this.commonFactor + ((Geometric) other).commonFactor ));

		return newP;
	}

	@Override
	public Progression substract(Progression other) {

		Progression newP = new Geometric((this.firstValue()-other.firstValue()),(this.commonFactor - ((Geometric) other).commonFactor ));

		return newP;
	}
}
