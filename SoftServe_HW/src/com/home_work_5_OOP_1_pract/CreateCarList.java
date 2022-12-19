package com.home_work_5_OOP_1_pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

public class CreateCarList 
{
	protected static int count = 0;

	protected static void createCarList(BufferedReader sc_1, HashMap<Integer, Car> car_map_list) throws IOException
	{
		boolean exit = false;
		String  in_word;
		String  in_car_model;
		int in_maxSpeed;
		int  in_year_manufacture;


		do
		{
			System.out.println("Please, to fill out the cars list and add new car in it,\nfirst enter type of car `truck` or `sedan`, max speed and year manufacture or word `exit` to quit without changes.");

			if("exit".equals( in_word = sc_1.readLine()) ) 
			{
				exit=true;
			}
			else 
			{
				if("sedan".equals( in_word) ) 
				{
					System.out.println("Please, enter car model");
					in_car_model = sc_1.readLine();
					System.out.println("sedan");
					System.out.println(in_car_model);
					car_map_list.put( count, new Sedan(in_car_model) );
				}
				else if("truck".equals( in_word) )
				{
					System.out.println("Please, enter car model");
					in_car_model = sc_1.readLine();
					System.out.println("truck");
					System.out.println(in_car_model);
					car_map_list.put( count, new Truck(in_car_model) );
				}

				System.out.println("Please, enter new car max speed.");

				in_maxSpeed = checkInFormatIntOrExit(sc_1);
				car_map_list.get(count-1).setMaxSpeed(in_maxSpeed);
				
				System.out.println("Please, enter new car year manufacture.");
				in_year_manufacture = checkInFormatIntOrExit(sc_1);
				car_map_list.get(count-1).setYearManufacture(in_year_manufacture);

				exit=false;
			}
		}while(!exit);

		car_map_list.forEach((k, v) -> System.out.println(k + ". Car type: " + v.model + ";\tCar model: " +  v.getModel() + ";\tCar max speed: " + v.getMaxSpeed() + ";\tCar year manufacture: " + v.getYearManufacture()));
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