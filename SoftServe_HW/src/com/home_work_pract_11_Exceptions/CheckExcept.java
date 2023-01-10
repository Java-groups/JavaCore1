package com.home_work_pract_11_Exceptions;

public class CheckExcept
{
	public static double div(double a, double b) throws ArithmeticException
	{
		if(a/b >= Double.POSITIVE_INFINITY | a/b <= Double.NEGATIVE_INFINITY) 
		{
			throw new ArithmeticException("Perhaps dividing double by zero.");
		}
		else
		{
			return a/b;
		}
	}
}