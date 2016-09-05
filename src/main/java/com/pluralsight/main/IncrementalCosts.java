package com.pluralsight.main;

public class IncrementalCosts extends PolynomialQuantity {

	public IncrementalCosts(final double intercept,final double slope) {
		super(new double[]{intercept,slope});
		
	}
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Incremental Cost!!";
	}

}
