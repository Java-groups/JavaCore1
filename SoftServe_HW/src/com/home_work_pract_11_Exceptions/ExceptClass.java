package com.home_work_pract_11_Exceptions;

import java.io.BufferedReader;
import java.io.IOException;

public class ExceptClass
{

	protected static int[] enterIntValue(BufferedReader br) throws IOException
	{
		String in_word;
		int side[] = new int[2];

outside:do 
		{
			System.out.println("Please, enter integer value `first side of rectangle`, or word `exit` to exit.");
			in_word = br.readLine();
			if("exit".equals(in_word))
			{
				break;
			}else
			{
				try 
				{
					side[0] = Integer.parseInt(in_word);
				}
				catch(NumberFormatException e) 
				{
					continue outside;
				}

		inside:do 
				 {
					System.out.println("Please, enter integer value `second side of rectangle`, or `q` to exit.");
					in_word = br.readLine();
					if("q".equals(in_word))
					{
						break;
					}
					else 
					{
					 	try 
						{
							side[1] = Integer.parseInt(in_word);
							break;
						}
					 	catch(NumberFormatException e) 
						{
							continue inside;
						}
					}
				 }while(true);
			}
		}
		while(true);
		return side;
	}

	public static int squareRectangle(int a, int b) throws ArithmeticException
	{
		if(a<0)
		{
			throw new ArithmeticException("InputValueException: First square side value less then zero.");
		}else if(b<0) 
		{
			throw new ArithmeticException("InputValueException: Second square side value less then zero.");
		}
		return a*b;
	}
	
	
	
}