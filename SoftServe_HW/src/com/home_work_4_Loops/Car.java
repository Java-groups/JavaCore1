package com.home_work_4_Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Car 
{
	private int car_year;
	private double engine_capacity;
	// private static HashMap<Integer, Car> car_map_list = new HashMap<Integer, Car>();

	private static int count = 0;


	public Car(int car_year) 
	{
		this.car_year = car_year;
		count++;
	}
	public int getCar_year() 
	{
		return car_year;
	}
	public void setCar_year(int car_year) 
	{
		this.car_year = car_year;
	}
	public double getEngine_capacity() 
	{
		return engine_capacity;
	}
	public void setEngine_capacity(double engine_capacity) 
	{
		this.engine_capacity = engine_capacity;
	}

/* version before check exceptions
	protected static void createCarInstanceList(Scanner sc, HashMap<Integer, Car> car_map_list)
	{
		boolean exit = false;
		String  in_word;
		int input_car_year;
		double  input_car_capacity;

		do
		{
			System.out.println("Please, to fill out the cars list and add new car in it,\nfirst enter year of production and then engine capacity or word `exit` to quit without changes.");

			if("exit".equals( in_word = sc.next()) ) 
			{
				exit=true;
			}
			else
			{
				input_car_year = Integer.parseInt(in_word);
				car_map_list.put( count, new Car(input_car_year) );

				System.out.println("Please, enter new car engine capacity.");

				input_car_capacity = Car.checkInFormatDoubleOrExit(sc);
				car_map_list.get(count-1).setEngine_capacity(input_car_capacity);

				exit=false;
			}
		}while(!exit);
	}
*/

	protected static void createCarInstanceList(BufferedReader br, HashMap<Integer, Car> car_map_list) throws IOException, Exception
	{
		boolean exit = false;
		String  in_word;
		int input_car_year;
		double  input_car_capacity;

		do
		{
			System.out.println("Please, to fill out the cars list and add new car in it,\nfirst enter year of production and then engine capacity or word `exit` to quit without changes.");

			if( (in_word = br.readLine()).isEmpty() )
			{
				throw new Exception("In double field was entered empty value.");
			}
			if("exit".equals( in_word)) 
			{
				exit=true;
			}
			else
			{
				input_car_year = Integer.parseInt(in_word);
				car_map_list.put( count, new Car(input_car_year) );

				System.out.println("Please, enter new car engine capacity.");

				input_car_capacity = Car.checkInFormatDoubleOrExit(br);
				car_map_list.get(count-1).setEngine_capacity(input_car_capacity);

				exit=false;
			}
		}while(!exit);
	}
	
/*
version before check exceptions
	protected static int checkInFormatIntOrExit(Scanner sc)
	{
		do
		{
			String in_word;

			System.out.println("Please, enter integer numeric value, or `q` for exit.");

			try 
			{
				return "q".equals(in_word=sc.next()) ? 0 : Integer.parseInt(in_word);	
			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter numeric value , or for exit enter: q.");
			}
		}while(true);
	}
*/
	
	protected static int checkInFormatIntOrExit(BufferedReader br) throws IOException, Exception
	{
		do
		{
			String in_word;

			System.out.println("Please, enter integer numeric value, or `q` for exit.");

			try 
			{
				if( (in_word = br.readLine()).isEmpty() )
				{
					throw new Exception("In integer field was entered empty value.");
				}
				else if("q".equals(in_word))
				{
					break;
				}
				else
				{
					 return Integer.parseInt(in_word);
				}	
			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter numeric value , or for exit enter: q.");
			}
		}while(true);

		return 0;
	}

/*
version before check exception
	protected static double checkInFormatDoubleOrExit(Scanner sc)
	{
		do
		{
			String in_word;
			
			System.out.println("Please, enter numeric value that will belong or not to the range, or `q` for exit.");
			
			try 
			{
				return "q".equals(in_word = sc.next()) ? 0 : Double.parseDouble(in_word);	
			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter numeric value , or for exit enter: q.");
			}
		}while(true);
	}
*/
	
	protected static double checkInFormatDoubleOrExit(BufferedReader br) throws IOException, Exception
	{
		do
		{
			String in_word;
			
			System.out.println("Please, enter numeric value that will belong or not to the range, or `q` for exit.");
			
			try 
			{
				if( (in_word = br.readLine()).isEmpty() )
				{
					throw new Exception("In integer field was entered empty value.");
				}
				else if("q".equals(in_word))
				{
					break;
				}
				else
				{
					 return Double.parseDouble(in_word);
				}		
			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter numeric value , or for exit enter: q.");
			}
		}while(true);
		return 0;
	}

	protected static void showCarsInfo(HashMap<Integer, Car> car_map_list) 
	{
		car_map_list.forEach((k, v) -> {System.out.println(k+1 + ". Car year: " + v.getCar_year() + "\tCar engine capacity: " + v.getEngine_capacity());});
	}

	protected static void showCarsByYear(int car_year, HashMap<Integer, Car> car_map_list)
	{
		car_map_list.forEach((k, v) -> {
			if(v.getCar_year() == car_year) 
			{
				System.out.println(k+1 + ". Car year: " + v.getCar_year() + "\tCar engine capacity: " + v.getEngine_capacity());
			}
			});
	}

	protected static void sortByYear(HashMap<Integer, Car> car_map_list)
	{
		int count = 0;
		List<Car> list = new LinkedList<Car>(car_map_list.values());

		Collections.sort(list, (l1, l2) -> l1.getCar_year() - l2.getCar_year());

		list.forEach( (k) -> { System.out.println("Year: " + k.getCar_year() + "\t\tEngine capacity: " + k.getEngine_capacity()); } );

	}

}