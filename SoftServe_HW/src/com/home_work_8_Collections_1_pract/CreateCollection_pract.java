package com.home_work_8_Collections_1_pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class CreateCollection_pract
{

	protected static void CreateValuesList(List<Integer> ts, BufferedReader br) throws IOException 
	{
			boolean exit = false;
			String in_word;
		do
		{
			System.out.println("Please, to fill out the values list and add new value in it,\nenter integer value or word `exit` to quit without changes.");

			if("exit".equals( in_word = br.readLine() ))
			{
				exit=true;
			}
			else
			{
				try 
				{
					Integer.parseInt( in_word);
					ts.add(Integer.parseInt( in_word) );
				}
				catch(NumberFormatException exc) 
				{
					System.out.println("Please, enter integer value.");
				}
				exit=false;
			}
		}while(!exit);
	}

	protected static List<Integer> CollectionKeepPositionsMoreThan(List<Integer> tm, Integer i) throws IndexOutOfBoundsException, IllegalArgumentException
	{
		return tm.subList(i+1, tm.size());
	}

	protected static List<Integer> CollectionKeepValuesLessThan(List<Integer> tm, Integer i)
	{
		tm.sort((arg0, arg1) -> arg0 - arg1);
		tm.removeIf(t -> t > 20);
		return tm;
	}

	protected static void showCollection(List<Integer> tm)
	{
		System.out.println();
		for (int i = 0; i < tm.size(); i++) 
		{
			System.out.print("position: " + i + ";\tvalue: " + tm.get(i)+";\n");
		}
	}

}