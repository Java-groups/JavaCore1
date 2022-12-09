package com.home_work_3_Conditions_pract;

import java.util.Scanner;

public class Conditions_Practice 
{
	public static void main(String[] args) 
	{

		Scanner sc_in = new Scanner(System.in);

		System.out.println("\t\t\tHOME WORK 3 PRACTICAL TASK 1");
		CheckCondition inAndCheckOdd = new CheckCondition();
		inAndCheckOdd.check_odd(sc_in);
		System.out.println("Amount of entered odd values is:" + CheckCondition.count);

		int i;

		System.out.println("\n\t\t\tHOME WORK 3 PRACTICAL TASK 2");
		System.out.println("\nPlease, enter number of week day and get it translation to ukrainian language.");
		System.out.print(DayOfWeek.values()[i= CheckCondition.checkInFormatDayNum(sc_in)].getP1() + " ");
		System.out.println(DayOfWeek.values()[i].getP2());

		System.out.println("\n\t\t\tHOME WORK 3 PRACTICAL TASK 3");
		ContinentNames.getContinent(sc_in);

		System.out.println("\n\t\t\tHOME WORK 3 PRACTICAL TASK 4");
		Product pr = new Product();

		pr.fillOutProductList(sc_in);
		System.out.println(pr.getMaxPriceProduct());
		System.out.println(pr.getMaxQuantityProduct());

		sc_in.close();

	}
}