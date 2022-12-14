package com.home_work_4_Loops_pract;

import java.util.Scanner;

public class CheckInput
{

	static int count=0;

	protected static double checkInFormatDoubleOrExit(Scanner in)
	{
		String in_word;

		do 
		{
			System.out.println("Please, enter value greter than zero, or q for exit.");
			try 
			{
				while( !"q".equals(in_word=in.next()) & Double.parseDouble(in_word) <= 0 )
				{
					System.out.println("Please, enter value greater than zero, or for exit enter: q.");
					return -1;
				}
				if ("q".equals(in_word)) 
				{
					return -1;
				}
				else 
				{
					return Double.parseDouble(in_word);
				}
			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter value greater than zero, or for exit enter: q.");
			}
		}while(true); 
	}

	protected static int checkInFormatIntegerOrExit(Scanner in)
	{
		String in_word;

		do 
		{
			System.out.println("Please, enter value greter than zero, or q for exit.");
			try 
			{
				while( !"q".equals(in_word=in.next()) & Integer.parseInt(in_word) <= 0 )
				{
					System.out.println("Please, enter value greater than zero, or for exit enter: q.");
					return -1;
				}
				if ("q".equals(in_word)) 
				{
					return -1;
				}
				else 
				{
					return Integer.parseInt(in_word);
				}
			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter value greater than zero, or for exit enter: q.");
			}
		}while(true); 
	}

	protected static int getMin(int[] arg)
	{
		int min_value = arg.length > 0 ? arg[0] : 0;

		for(int i = arg.length - 1; i >= 0; --i) 
		{
			min_value = ( min_value > arg[i] ) ? arg[i] : min_value;
		}

		return min_value;
	}

	protected static int getMax(int[] arg)
	{
		int max_value = arg.length > 0 ? arg[0] : 0;

		for(int i = arg.length - 1; i >= 0; --i) 
		{
			max_value = ( max_value < arg[i] ) ? arg[i] : max_value;
		}

		return max_value;
	}
	
	protected static int getSumOfPositive(int[] arg)
	{
		int sum = 0;

		for(int a : arg) 
		{
			if(a > 0)
			{
				sum += a;
			}
		}

		return sum;
	}
	
	protected static int getAmountOfNeg(int[] arg)
	{
		int count=0;
		for(int a : arg) 
		{
			if(a < 0)
			{
				count++;
			}
		}
		return count;
	}
	
	protected static boolean getPosOrNeg(int[] arg)
	{
		double i;
		i = arg.length/getAmountOfNeg(arg);
		if(i < 2.0) 
		{
			return false;
		}
		return true;
	}
}