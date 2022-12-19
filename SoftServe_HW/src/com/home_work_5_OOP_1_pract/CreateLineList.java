package com.home_work_5_OOP_1_pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

public class CreateLineList 
{

	protected static int count = 0;

	protected static void createLineList(BufferedReader sc_1, HashMap<Integer, Object> line_map_list) throws IOException
	{
		boolean exit = false;
		String  in_word;
		int  in_year_manufacture;


		do
		{
			System.out.println("Please, to fill out the list choose what you need to add in list,\n1. Enter `point` to add new point in list;\n2. Enter `line` to add new line in list;\nor word `exit` to quit without changes.");

			if("exit".equals( in_word = sc_1.readLine()) ) 
			{
				exit=true;
			}
			else 
			{
				if("point".equals( in_word) ) 
				{
					System.out.println("Please, enter point coordinates.\nEnter X: ");
					line_map_list.put(count++, new Point(checkInFormatIntOrExit(sc_1)));

					System.out.println("Please, enter point coordinates.\nEnter Y: ");
					((Point) line_map_list.get(count-1)).setY(checkInFormatIntOrExit(sc_1));
					line_map_list.get(count-1) ;
				}
				else if("line".equals( in_word) )
				{
					System.out.println("Please, enter point coordinates.\nEnter X_1: ");
					line_map_list.put(count++, new ColorLine());
					((ColorLine) line_map_list.get(count-1)).setX_1(checkInFormatIntOrExit(sc_1));

					System.out.println("Please, enter point coordinates.\nEnter Y_1: ");
					((ColorLine) line_map_list.get(count-1)).setY_1(checkInFormatIntOrExit(sc_1));

					System.out.println("Please, enter point coordinates.\nEnter X_2: ");
					((ColorLine) line_map_list.get(count-1)).setX_2(checkInFormatIntOrExit(sc_1));

					System.out.println("Please, enter point coordinates.\nEnter Y_2: ");
					((ColorLine) line_map_list.get(count-1)).setY_2(checkInFormatIntOrExit(sc_1));

					System.out.println("Please, enter line color.");
					((ColorLine) line_map_list.get(count-1)).setColor(sc_1.readLine());

				}else
				{
					System.out.println("Please, choose which object you want create `point` or `line`.");
				}
				exit=false;
			}
		}while(!exit);

		//line_map_list.forEach((k, v) -> System.out.println(v.getClass().toString()));
		
		line_map_list.forEach((k, v) -> {
											if("class com.home_work_5_OOP_1_pract.Point".equals(v.getClass().toString())) 
											{
												System.out.println( ((Point) v).print() );
											}else if("class com.home_work_5_OOP_1_pract.ColorLine".equals(v.getClass().toString())) 
											{
												System.out.println(((ColorLine) v).print() );
											}
										});
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