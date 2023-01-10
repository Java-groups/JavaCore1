package com.home_work_pract_10_StringRegex;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RegexApp
{
	public static void main(String[] args)
	{

		BufferedReader br_1 = new BufferedReader(new InputStreamReader(System.in));
/*
		try
		{
			CreateList.findPatternInString(br_1);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
*/
/*	
		try 
		{
			CreateList.parsingNameString(br_1);
			br_1.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
*/

		String str = "Firstword secondword thirdword fourthworddd fifthword";
		String[] str_arr = str.split("\\s+");
		StringBuffer sb = new StringBuffer();
		sb.append(str_arr[1]);

		CreateList.getMax(str_arr);
//		System.out.println("2nd word in reverse order: " + sb.reverse());

/*
		str = "I  am   learning  Java    core";
		str_arr = str.split("\\s+");
		str = "";
		for (int i = 0; i < str_arr.length; i++)
		{
			str += str_arr[i].trim()+" ";
		}
		str = str.trim() + ".";
		System.out.print(str.trim());
*/

		CreateList.patternUScurrency("USp att $ern $1121.1210 string$15.12 iytcic$12.1110lylyvu");

	}
}