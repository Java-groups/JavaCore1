package com.home_work_3_Conditions_pract;

import java.util.Scanner;

public class CheckCondition
{

	static int count=0;

	public int check_odd(Scanner sc)
	{
		return checkInFormatAndOddCount(sc);
	}
	
	private int checkInFormatAndOddCount(Scanner sc_in)
	{
		String in_word;
		count=0;

		out:
		do 
		{
			System.out.println("Please, enter integer values to calculate amount of odd values, or for exit enter: q");
			try 
			{
				if ("q".equals(in_word=sc_in.next())) 
				{
					break out;
				}
				else
				{
					count=(Integer.parseInt(in_word) % 2 != 0 ) ? (count+=1) : count;
				}
			}
			catch(NumberFormatException exc)
			{
				System.out.println("To calculate number of entered odd values, please enter integer value, or `q` for exit. .");
			}
		}while(true);
		return count;
	}
	public static int checkInFormatDayNum(Scanner sc_in)
	{
		String in_word;

		out:
		do 
		{
			System.out.println("Please, enter integer value, or `q` for exit.");
			try 
			{
				while( !"q".equals(in_word=sc_in.next()) && ( (Integer.parseInt(in_word)<=0 || (Integer.parseInt(in_word)>7) ? true : false)))
				{
					System.out.println("Please, enter integer value in interval from 1 to 7, or `q`.");					
				}
				if ("q".equals(in_word)) 
				{
					break out;
				}
				else
				{
					return Integer.parseInt(in_word)-1;
				}
			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter integer value, or for exit enter: q.");
			}
		}while(true);
		return 0;
	}
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
}