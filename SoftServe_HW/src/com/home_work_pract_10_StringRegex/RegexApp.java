package com.home_work_pract_10_StringRegex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegexApp
{
	public static void main(String[] args)
	{

		BufferedReader br_1 = new BufferedReader(new InputStreamReader(System.in));

		String str1 = "IT";
		String str2 = "IT Academy";

		System.out.println("\t\t\tHOME_WORK_10_PRACTICAL_TASK_1\n");
		System.out.println(str2.contains(str1));

		System.out.println("\t\t\tHOME_WORK_10_PRACTICAL_TASK_2\n");
		try
		{
			CreateList.findPatternInString(br_1);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

		System.out.println("\t\t\tHOME_WORK_10_PRACTICAL_TASK_3\n");
		try 
		{
			CreateList.parsingNameString(br_1);
			
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}

		System.out.println("\t\t\tHOME_WORK_10_TASK_1\n");
		String str;
		try
		{
			System.out.println("Please, enter five words that separated by space.");
			str = br_1.readLine();
			String[] str_arr = str.split("\\s+");
			StringBuffer sb = new StringBuffer();
			sb.append(str_arr[1]);
			CreateList.getMax(str_arr);
			System.out.println("2nd word in reverse order: " + sb.reverse());
			br_1.close();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Was entered empty string field.");
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}


		System.out.println("\t\t\tHOME_WORK_10_TASK_2\n");
		str = "I  am   learning  Java    core";
		String[] str_arr = str.split("\\s+");
		str = "";
		for (int i = 0; i < str_arr.length; i++)
		{
			str += str_arr[i].trim()+" ";
		}
		str = str.trim() + ".";
		System.out.print(str.trim());
		System.out.println();


		System.out.println("\n\t\t\tHOME_WORK_10_TASK_3");
		CreateList.patternUScurrency("USp att $ern $1121.1210 string$15.12 iytcic$12.1110lylyvu");

	}
}