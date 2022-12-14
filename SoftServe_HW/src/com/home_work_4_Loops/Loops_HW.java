package com.home_work_4_Loops;

import java.util.HashMap;
import java.util.Scanner;

public class Loops_HW 
{
	public static HashMap<Integer, Car> car_map_list = new HashMap<Integer, Car>();

	public static void main(String[] args) 
	{

		System.out.println("\t\t\t HOME WORK 4 TASK 1");

		Scanner sc = new Scanner(System.in);

/*
		EnterMonth.showAmountOfDays(EnterMonth.createMonthDaysList(sc));

		System.out.println("\t\t\t HOME WORK 4 TASK 2");

		EnterMonth.sumOfFirstElements(EnterMonth.fillOutValuesArr(sc, 10));

		System.out.println("Position of second positive value in array: " + EnterMonth.numbSecPositInArr(EnterMonth.fillOutValuesArr(sc, 5)));

		System.out.println("\t\t\t HOME WORK 4 TASK 3_1");

		System.out.println("Position of min value in array: " + EnterMonth.getMin(EnterMonth.fillOutValuesArr(sc, 10)));

		System.out.println("\t\t\t HOME WORK 4 TASK 3_2");

		System.out.println("Position of min value in array: " + EnterMonth.getMinPosition(EnterMonth.fillOutValuesArr(sc, 10)));

		System.out.println("\t\t\t HOME WORK 4 TASK 3_3");
		System.out.println("Please fill out array to get product of all it even values.");

		System.out.println( EnterMonth.getProdOfAllEven(EnterMonth.fillOutValuesArr(sc, 10)));
*/

		System.out.println("\t\t\t HOME WORK 4 TASK 4");
		System.out.println("Please, to fill out car list enter year of production and then engine capacity.");
		Car.createCarInstanceList(sc, car_map_list);

		Car.showCarsInfo(car_map_list);

		System.out.println("Please, enter car year of production to show cars list by year.");
		Car.showCarsByYear(Car.checkInFormatIntOrExit(sc), car_map_list);

		System.out.println("Below sorted cars list by year.");
		Car.sortByYear(car_map_list);

	}
}