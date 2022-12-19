package com.home_work_5_OOP_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

public class CreateBirdList
{
	protected static int count = 0;

	protected static void createBirdList(BufferedReader sc_1, HashMap<Integer, Object> bird_map_list) throws IOException
	{
		boolean exit = false;
		String  in_word;

	out:do
		{
			System.out.println("Please, to fill out the list choose what you need to add in list,\n1. Enter `chicken`, `penguin`, `swallow` or `eagle` to add new point in list;\nor word `exit` to quit without changes.");

			if("exit".equals( in_word = sc_1.readLine()) ) 
			{
				exit=true;
			}
			else 
			{
				switch (in_word)
				{
					case "chicken": 
									System.out.println("Please, enter chicken name.");
									bird_map_list.put(count++, new Chicken(sc_1.readLine())); break;
					case "penguin": 
									System.out.println("Please, enter penguin name.");
									bird_map_list.put(count++, new Penguin(sc_1.readLine())); break;
					case "swallow": 
									System.out.println("Please, enter swallow name.");
									bird_map_list.put(count++, new Swallow(sc_1.readLine())); break;
					case "eagle": 
									System.out.println("Please, enter eagle name.");
									bird_map_list.put(count++, new Eagle(sc_1.readLine())); break;
					default: 
							System.out.println("Please, choose which bird you want add in list: `chicken`, `penguin`, `swallow`, `eagle`.");
							exit = false;
							continue out;
				}

				exit = false;
			}
		}while(!exit);

		bird_map_list.forEach((k, v) -> System.out.println(k + ". " + "; Name: " + ((Employee)v).getName() + "; Salary: " + ((Employee)v).getSalary() + "; Department: " + ((Employee)v).getDepartment()));
	}

	protected static int checkInFormatIntOrExit(BufferedReader sc) throws IOException
	{
		do
		{
			String in_word;

			System.out.println("Please, enter integer numeric value, or `q` for exit.");

			try 
			{
				return "q".equals(in_word = sc.readLine()) ? 0 : Integer.parseInt(in_word);	
			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter numeric value , or for exit enter: q.");
			}
		}while(true);
	}

}