package com.home_work_3_Conditions;

import java.util.HashMap;
import java.util.Scanner;

public class CheckCondition 
{
	protected static boolean valueInRange(int min_range, int max_range, double in_value)
	{
		return ( (in_value >= min_range) & (in_value <= max_range) ) ? true : false;
	}

	protected static int checkInFormatIntOrExit(Scanner sc)
	{
		do
		{
			String in_word;

			System.out.println("Please, enter integer numeric value, or `q` for exit.");

			try 
			{
				return "q".equals(in_word=sc.next()) ? 0 : Integer.parseInt(in_word);	
			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter numeric value , or for exit enter: q.");
			}
		}while(true);
	}

	protected static double checkInFormatDoubleOrExit(Scanner sc)
	{
		do
		{
			String in_word;
			
			System.out.println("Please, enter numeric value that will belong or not to the range, or `q` for exit.");
			
			try 
			{
				return "q".equals(in_word = sc.next()) ? 0 : Double.parseDouble(in_word);	
			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter numeric value , or for exit enter: q.");
			}
		}while(true);
	}

	protected static double getMin(double[] arg)
	{
		double min_value = arg.length>0 ? arg[0] : 0;

		for(int i = arg.length-1; i >= 0; --i) 
		{
			min_value = ( min_value > arg[i] ) ? arg[i] : min_value;
		}

		return min_value;
	}

	protected static double getMax(double[] arg)
	{
		double max_value = arg.length>0 ? arg[0] : 0;

		for(int i = arg.length-1; i >= 0; --i) 
		{
			max_value = ( max_value < arg[i] ) ? arg[i] : max_value;
		}

		return max_value;
	}

	protected static double[] bufferIntDouble(HashMap<Integer, Double> m)
	{
		double[] localArr = new double[m.size()];
		
		m.forEach((k, v) -> localArr[k] = v);
		
		return localArr;
	}

	protected static double[] fillOutNumbersArr(Scanner sc)
	{

		HashMap<Integer, Double> localMapBuffer = new HashMap<Integer, Double>();

		int iteration=0;

		do
		{
			String in_word;

			System.out.println("Please, enter numeric value that will be added in array on " + localMapBuffer.size() +" position, or `q` for exit.");
			try 
			{
				if ("q".equals(in_word=sc.next()))
				{
					return bufferIntDouble(localMapBuffer);
				}
				else 
				{
					localMapBuffer.put(iteration, Double.parseDouble(in_word));
					iteration++;
				}
			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter numeric value, or for exit enter: q.");
			}
		}while(true);
	}
}