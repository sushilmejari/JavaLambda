package com.pluralsight.main;

public class MonthByMonth implements QuantityOfInterest {
	private final double[] values;
	public MonthByMonth(double[] values) {
		this.values = values;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double valueAt(int time) {
		
		// TODO Auto-generated method stub
		return values[time-1];
	}

}
