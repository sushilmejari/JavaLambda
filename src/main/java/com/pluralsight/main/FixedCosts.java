package com.pluralsight.main;

public class FixedCosts extends PolynomialQuantity {

	public FixedCosts(double constant) {
		super(new double[]{constant});	
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Fixed Costs!!";
	}
	

}
