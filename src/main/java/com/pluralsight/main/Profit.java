package com.pluralsight.main;

public class Profit implements QuantityOfInterest {

	private final Sales sales;
	private final IncrementalCosts incrementalCosts;
	private final FixedCosts fixedCost;

	public Profit(Sales sales, IncrementalCosts incrementalCosts,
			FixedCosts fixedCost) {
		this.sales = sales;
		this.incrementalCosts = incrementalCosts;
		this.fixedCost = fixedCost;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Profit!!";
	}

	@Override
	public double valueAt(final int time) {
		// TODO Auto-generated method stub
		return sales.valueAt(time)-(incrementalCosts.valueAt(time)+fixedCost.valueAt(time));
	}

}
