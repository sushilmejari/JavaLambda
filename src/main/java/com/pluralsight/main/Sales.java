package com.pluralsight.main;

public class Sales extends MonthByMonth{

	public Sales(double[] values) {
		super(values);
	}
	
	@Override
	public String getName() {
			return "Expected Sales";
	}
	

}
