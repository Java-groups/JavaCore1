package com.home_work_pract_11_Exceptions;

import java.io.BufferedReader;
import java.io.IOException;

public class CheckInput
{

	protected static double[] enterDoubleValue(BufferedReader br) throws IOException
	{
		String in_word;
		double divide[] = new double[2];

outside:do 
		{
			System.out.println("Please, enter double value of divide, and then enter value of divider or word `exit` to exit.");
			in_word = br.readLine();
			if("exit".equals(in_word))
			{
				break;
			}else
			{
				try 
				{
					divide[0] = Double.parseDouble(in_word);
				}
				catch(NumberFormatException e) 
				{
					throw new ArithmeticException("Entered not double value.");
				}

		inside:do 
				 {
					System.out.println("Please, enter double value of divider, and then enter `exit` and watch the result.");
					in_word = br.readLine();
					if("q".equals(in_word))
					{
						break;
					}
					else 
					{
					 	try 
						{
					 		divide[1] = Double.parseDouble(in_word);
							break;
						}
					 	catch(NumberFormatException e) 
						{
					 		throw new ArithmeticException("Entered not double value.");
						}
					}
				 }while(true);
			}
		}
		while(true);
		return divide;
	}

	protected static int[] enterIntValue(BufferedReader br) throws IOException
	{
		String in_word;
		int [] int_arr = new int[10];
		int count = 0;

		do
		{
			System.out.println("Please, enter integer: " + (count+1) + " of 10 values, or word `exit` to exit.");
			in_word = br.readLine();
			if("exit".equals(in_word))
			{
				break;
			}
			else
			{
				try 
				{
					int_arr[count] = Integer.parseInt(in_word);
					count++;
				}
				catch(NumberFormatException e) 
				{
					throw new ArithmeticException("Entered not integer value.");
				}
			}
		}
		while(count!=10);
		return int_arr;
	}

	public static void readNumber(int[] in_int_arr, int start, int end) throws NotInRangeExcept, IOException
	{
		for(int i=0; i < in_int_arr.length; i++)
		{
			if( in_int_arr[i] >= start && in_int_arr[i] <= end )
			{
				System.out.println("Entered value in range: " + in_int_arr[i]);
			}
			else
			{
				throw new NotInRangeExcept("Entered value not in range.");
			}
		}
	}
}