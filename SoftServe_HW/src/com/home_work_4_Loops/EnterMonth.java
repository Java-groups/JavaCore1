package com.home_work_4_Loops;

import java.util.Arrays;
import java.util.Scanner;

public class EnterMonth 
{

	protected static int[] createMonthDaysList(Scanner sc)
	{
		boolean exit = false;
		String  in_days_amount;
		int[] months = new int[12];
		do
		{
			System.out.println("Please, to fill out list of months and add number of it days in it,\nenter amount days of each month.");

			try
			{

				for(int i=0; i<12; i++) 
				{
					System.out.println("Please, enter amount of days in " + MonthOfYear.values()[i].getP2());
					while( !"q".equals(in_days_amount = sc.next()) & Integer.parseInt(in_days_amount) <= 0 )
					{
						System.out.println("Please, enter value greater than zero, or for exit enter: q.");
					}
					if ("q".equals(in_days_amount)) 
					{
						exit = true;
					}
					else 
					{
						months[i] = Integer.parseInt(in_days_amount);
					}
				}
				exit=true;
			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter value greater than zero, or for exit enter: q.");
			}
		}while(!exit); 

		return months;
	}

	protected static void showAmountOfDays(int[] months)
	{
		for (int i=0; i<12; i++) 
		{
			System.out.println(MonthOfYear.values()[i].getP2() + ". \t" + months[i]);
		}
	}

	protected static int[] fillOutValuesArr(Scanner sc, int arr_size) 
	{
		int[] arr = new int[arr_size];
		boolean exit = false;
		String  in_values;

		do
		{
			System.out.println("Please, to fill out array of two elements,\nenter numeric value, or word `exit` to quit without changes.");

			try
			{

				for(int i=0; i<arr_size; i++) 
				{
					System.out.println("Please, enter value number: " + (i+1));

					if ("q".equals(in_values = sc.next())) 
					{
						exit = true;
					}
					else 
					{
						arr[i] = Integer.parseInt(in_values);
					}
				}
				exit=true;
			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter integer value, or for exit enter: q.");
			}
		}while(!exit); 
		
		return arr;
	}

	protected static boolean ifFirstElementsPositive(int[] arr, int numFirstElem) 
	{
		boolean exit = true;

		for (int i=0; i<numFirstElem; i++) 
		{
			if(arr[i] < 0) 
			{
				exit = false;
			}
		}

		return exit;
	}

	protected static void sumOfFirstElements(int[] arr) 
	{
		int sum=0;
		String message;

		if(ifFirstElementsPositive(arr, 5)) 
		{
			for(int i = 0; i<5; i++)
			{
				sum += arr[i] ;
			}
		}
		else
		{
			for(int i = arr.length-1; i >= arr.length-5; --i)
			{
				sum += arr[i] ;
			}
		}
		message = ifFirstElementsPositive(arr, 5) ? "first" : "last";
		System.out.println("Sum of " + message + " five elements is: " + sum);
	}

	protected static int numbSecPositInArr(int[] arr) 
	{
		int count=0;
		int position = -1;
		
		for(int i=0; i < arr.length; i++) 
		{
			if(arr[i] > 0)
			{
				count++;
			}
			if(count == 2)
			{
				position = i;
				return position;
			}

		}
		return position;
	}

	protected static int getMin(int[] arr)
	{
		int min_value = arr.length > 0 ? arr[0] : 0;

		for(int i = arr.length - 1; i >= 0; --i) 
		{
			min_value = ( min_value > arr[i] ) ? arr[i] : min_value;
		}

		return min_value;
	}

	protected static int getMinPosition(int[] arr)
	{
		int min_val = getMin(arr);
		int min_pos=-1;

		for(int i=0; i<arr.length; i++) 
		{	
			if(arr[i] == min_val) 
			{ 
				min_pos = i; 
				break;
			};
		}
		return min_pos;
	}

	protected static int getProdOfAllEven(int[] arr)
	{
		int even_prod = 1;
		int even_next = 0;

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2 == 0) 
			{
				even_next = arr[i];
				even_prod = even_next*even_prod;
			}
		}
		return even_prod;
	}
}