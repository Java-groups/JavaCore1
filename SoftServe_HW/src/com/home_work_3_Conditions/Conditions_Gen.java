package com.home_work_3_Conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Conditions_Gen
{

	public static void main(String[] args)
	{

		Scanner sc_in = new Scanner(System.in);
		BufferedReader br_1 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\t\t\tHOME WORK 3 TASK 1_1");
		try
		{	
			if( CheckCondition.valueInRange(-5, 5, CheckCondition.checkInFormatDoubleOrExit(br_1)) )
			{
				System.out.println("Entered value belong to the range.");
			}
			else
			{
				System.out.println("Entered value not belong to the range.");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		System.out.println("\t\t\tHOME WORK 3 TASK 1_2");
		try 
		{
			System.out.println("Please, fill out array with numeric values and enter `q` to exit.");
			double[] i;
			System.out.println("Min value of entered array: " + CheckCondition.getMin( i = CheckCondition.fillOutNumbersArr(br_1)) );
			System.out.println("Max value of entered array: " + CheckCondition.getMax(i));
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}


		System.out.println("\t\t\tHOME WORK 3 TASK 1_3");
		try
		{
			HTTPError.getValues(HTTPError.checkInFormatIntOrExit(br_1));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		System.out.println("\t\t\tHOME WORK 3 TASK 2");
		try
		{
			Dog.createDogInstanceList(br_1);
			Dog.showDogs();
			System.out.println("Max dog age: " + Dog.getOlderDogAge() + "; Breed: " + Dog.getOlderDogBreed() + "; Dog name: " + Dog.getOlderDogName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				br_1.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		

		sc_in.close();

	}
}