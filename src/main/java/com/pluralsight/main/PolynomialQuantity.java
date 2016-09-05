package com.pluralsight.main;

public class PolynomialQuantity implements QuantityOfInterest {

	public PolynomialQuantity(final double[] coefficients) {
		super();
		this.coefficients = coefficients;
	}
	

	private final double[] coefficients;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double valueAt(int time) {
		double value=0.0;
		for(int i=0; i<coefficients.length;i++)
		{
			value+=coefficients[i]* Math.pow(time, i);
		}
			
		return value;
	}

}
