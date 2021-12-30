package Abtraction;

public abstract class Currency {

	double usDollars;
	
	public Currency (double usDollars) {
		
		this.usDollars =  usDollars;
		
		
	}
	
	abstract double USToCAConcerter();
	
	
	public double USToTHConcerter() {
		double result = usDollars * 33.38;
		
		return result;
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
