package com.home_work_5_OOP_1;

import java.io.BufferedReader;
import java.io.IOException;

public class CheckInput
{

	static int count=0;

	protected static double checkInFormatDoubleOrExit(BufferedReader in) throws IOException
	{
		String in_word;

		do 
		{
			System.out.println("Please, enter value greter than zero, or q for exit.");
			try 
			{
				while( !"q".equals(in_word = in.readLine()) & Double.parseDouble(in_word) <= 0 )
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

	protected static int checkInFormatIntegerOrExit(BufferedReader in) throws IOException
	{
		String in_word;

		do 
		{
			System.out.println("Please, enter value greter than zero, or q for exit.");
			try 
			{
				while( !"q".equals(in_word = in.readLine()) & Integer.parseInt(in_word) <= 0 )
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

}