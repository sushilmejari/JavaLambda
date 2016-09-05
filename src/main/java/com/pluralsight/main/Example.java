package com.pluralsight.main;

import java.util.function.IntToDoubleFunction;

public class Example {
final static double[] EXPECTED_SALES_JAN_TO_DEC=new double[]{42.0,45.6,43.6,50.2,55.6,54.7,58.0,57.3,62.0,60.3,71.2,88.8};
	public static void main(String[] args) {
		double total=0.0;
		final Sales sales=new Sales(EXPECTED_SALES_JAN_TO_DEC);
		final FixedCosts fixedCosts=new FixedCosts(15.0);
		final IncrementalCosts incrementalcost=new  IncrementalCosts(5.1,0.15);
		final Profit profit=new Profit(sales,incrementalcost,fixedCosts);
		for(int i=1;i<=12;i++)
		{
		total+=profit.valueAt(i);
		}
		
		System.out.println("Totla Profit for the year"+total);
		 
		
		
		
		final FunctionOverTime sales2 =(time)-> EXPECTED_SALES_JAN_TO_DEC[time-1];
		
		final FunctionOverTime fixedCosts2 = FunctionOverTime.constant(15.0);
		final FunctionOverTime incrementalCosts2 =FunctionOverTime.line(5.1, 0.15);
		
		
		final FunctionOverTime profit2 =(time)-> sales2.valueAt(time)-(fixedCosts2.valueAt(time)+incrementalCosts2.valueAt(time));
			
double total2 =0.0;		
		for(int i=1;i<=12;i++)
		{
		total2+=profit2.valueAt(i);
		}
		
		System.out.println(total2);
		
		final FunctionOverTime profit3=FunctionOverTime.combinationOf3(sales2, incrementalCosts2, fixedCosts2,(s,ic,fc) ->s -ic-fc);
		double total3 =0.0;		
		for(int i=1;i<=12;i++)
		{
		total3+=profit3.valueAt(i);
		}
		System.out.println(total3);
	}

}
