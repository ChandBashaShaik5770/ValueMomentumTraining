package com.vm.training.assignment;

public class ArithmeticDivision implements IArithmetic
{
	
	public int divisor(int number) {
		
		int sum=number;
		
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}


}
