package com.home_work_8_Collections_1_HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CreateCollection
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

	protected static int CollectionGetMin(List<Integer> tm)
	{
		tm.sort((arg0, arg1) -> arg0 - arg1);
		return tm.get(0);
	}

	protected static int CollectionGetMax(List<Integer> tm)
	{
		tm.sort((arg0, arg1) -> arg0 - arg1);
		return tm.get(tm.size()-1);
	}

	protected static void showCollection(List<Integer> tm)
	{
		System.out.println();
		for (int i = 0; i < tm.size(); i++) 
		{
			System.out.print("position: " + i + ";  value: " + tm.get(i)+";  \n");
		}
		System.out.println();
	}

	protected static void addThreeValuesBeforeNeg(List<Integer> tm)
	{
		Random random = new Random();

		for (int i = 0; i < tm.size(); i++)
		{
			if(tm.get(i)< 0)
			{
				for(int j=i; j < i+3; j++)
				{
					tm.add( j, random.nextInt() );
				}
				break;
			}
		}
	}

	protected static void insesrtZeroBetweenSign(List<Integer> tm)
	{
		for (int i = 0; i < tm.size(); i++)
		{
			try 
			{
				if(tm.get(i) < 0 & (tm.get(i-1) > 0) )
				{
					tm.add( i, 0);
				}
				else if(tm.get(i) < 0 & (tm.get(i+1) > 0))
				{
					tm.add( i+1, 0);
				}
			}
			catch(IndexOutOfBoundsException ex) 
			{
				
			}
		}
	}

	protected static List<Integer> copyReverseElements(List<Integer> tm) throws IndexOutOfBoundsException, IllegalArgumentException
	{
		List<Integer> list = new LinkedList<Integer>();
		list.addAll(tm);
		Collections.reverse(list);
		return list;
	}

	protected static List<Integer> copyElements(List<Integer> tm, Integer i) throws IndexOutOfBoundsException, IllegalArgumentException
	{
		List<Integer> list = new LinkedList<Integer>();
		list = tm.subList(0, i);
		return list;
	}

	protected static void removeLastEvenElement(List<Integer> tm) 
	{
		for(int i = tm.size()-1; i >= 0; i--) 
		{
			if(tm.get(i) % 2 == 0) 
			{
				System.out.println("Collection contains even value at position: " + tm.indexOf(tm.get(i)));
				tm.remove(tm.indexOf(tm.get(i)));
				break;
			}
			else if(i == 0 & tm.get(0) % 2 != 0)
			{
				System.out.println("Collection does not contain even value.");
			};
		}

	}
	
	protected static void removeFirstMin(List<Integer> list)
	{
		Object[] arg = list.toArray();
		int min_value = arg.length > 0 ? (int) arg[0] : 0;

		for(int i = arg.length - 1; i >= 0; i--) 
		{
			min_value = ( min_value > (int) arg[i] ) ? (int) arg[i] : min_value;
		}
		if(list.indexOf(min_value) != list.size()-1) 
		{
			list.remove(list.indexOf(min_value));
		}
	}

}