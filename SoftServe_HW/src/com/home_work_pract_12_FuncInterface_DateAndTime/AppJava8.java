package com.home_work_pract_12_FuncInterface_DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.*;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class AppJava8
{
								//Practical task

	protected static List<String> sortListDirect(List<String> list)
	{
		Collections.sort(list);
		return list;
	}

	protected static List<String> sortListReverse(List<String> list)
	{
		Collections.sort(list, Collections.reverseOrder());
		return list;
	}

	protected static void count(int[] int_arr, Predicate<Integer> p) 
	{
		for (int i = 0; i <= int_arr.length; i++)
		{
			if(p.test(i)) {System.out.println(i);};
		}
	}

								//Home work
	protected static String encrypt(String s, int n) 
	{
		byte[] bytes = s.getBytes();
		for (int i = 0; i < bytes.length; i++)
		{
			bytes[i] = (byte) (bytes[i] + (byte)n);
		}

		return new String(bytes);
	}
	protected static String decrypt(String s, int n) 
	{
		byte[] bytes = s.getBytes();
		for (int i = 0; i < bytes.length; i++)
		{
			bytes[i] = (byte) (bytes[i] - (byte)n);
		}

		return new String(bytes);
	}
	
	protected static boolean yearIsLeap(int year) 
	{
		LocalDate date = LocalDate.now();
		return date.withYear(year).isLeapYear();
	}
	
	protected static void dateMethod(LocalDate date) 
	{
		System.out.println(date.getDayOfWeek());
		System.out.println(date.plusMonths(6).getDayOfWeek() );
		System.out.println(date.plusMonths(12).getDayOfWeek() );
	}

	public static void main(String[] args)
	{		

		System.out.println("\t\t\tPRACTICAL_WORK_TASK_1\n");
		
		LocalDate date = LocalDate.now();
		LocalDate first_monday;
		System.out.println(date.getDayOfWeek());
		
		System.out.println("\n\t\t\tPRACTICAL_WORK_TASK_2\n");
		
		first_monday = date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("Year of first monday: " + first_monday.getYear() + 
							"\nMonth of first monday: " + first_monday.getMonth() + 
							"\nDay of first monday: " + first_monday.getMonth());
		
		System.out.println("\n\t\t\tPRACTICAL_WORK_TASK_3\n");

		List<String> list = Arrays.asList("a","b","c","d","f","e","g","h","i","j");

		list = sortListDirect(list);
		System.out.println(list);

		list = sortListReverse(list);
		System.out.println(list);



		System.out.println("\n\t\t\tPRACTICAL_WORK_TASK_4\n");
		
		Predicate<Integer> func = (a) -> {if(a>8)
									{
										return true;
									}
									else
									{
										return false;
									}
									};
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		count(arr, func);

		System.out.println("\n\t\t\tHOME_WORK_TASK_1\n");
		System.out.println(encrypt("abc", 2));
		System.out.println(decrypt("cde", 2));

		System.out.println("\n\t\t\tHOME_WORK_TASK_2\n");
		System.out.println(date.format(DateTimeFormatter.ofPattern("MM.dd.yy")));

		System.out.println("\n\t\t\tHOME_WORK_TASK_3\n");
		System.out.println(yearIsLeap(2024) ? "Entered year is leak." : "Entered year is not leak.");
		LocalDate birth_date = LocalDate.parse("1989-07-17");

		System.out.println("\n\t\t\tHOME_WORK_TASK_3\n");
		dateMethod(birth_date);
		
	}
}