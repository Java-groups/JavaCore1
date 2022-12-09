package com.home_work_3_Conditions;

import java.util.Scanner;

public class Conditions_Gen
{

	public static void main(String[] args)
	{

		System.out.println("\t\t\tHOME WORK 3 TASK 1_1");

		Scanner sc_in = new Scanner(System.in);

	
		if( CheckCondition.valueInRange(-5, 5, CheckCondition.checkInFormatDoubleOrExit(sc_in)) )
		{
			System.out.println("Entered value belong to the range.");
		}
		else
		{
			System.out.println("Entered value not belong to the range.");
		}

		System.out.println("\t\t\tHOME WORK 3 TASK 1_2");

		System.out.println("Please, fill out array with numeric values and enter `q` to exit.");
		double[] i;
		System.out.println("Min value of entered array: " + CheckCondition.getMin( i = CheckCondition.fillOutNumbersArr(sc_in)) );
		System.out.println("Max value of entered array: " + CheckCondition.getMax(i));


		System.out.println("\t\t\tHOME WORK 3 TASK 1_3");
		HTTPError.getValues(HTTPError.checkInFormatIntOrExit(sc_in));
	
	
		System.out.println("\t\t\tHOME WORK 3 TASK 2");
		Dog.createDogInstanceList(sc_in);
		Dog.showDogs();
		System.out.println("Max dog age: " + Dog.getOlderDogAge() + "; Breed: " + Dog.getOlderDogBreed() + "; Dog name: " + Dog.getOlderDogName());

		sc_in.close();

	}
}