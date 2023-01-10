package com.home_work_pract_10_StringRegex;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CreateList
{
	protected static void findPatternInString(BufferedReader br) throws IOException
	{
		String in_string_pattern;

		do
		{
			System.out.println("Please, enter pattern of String that would be find in next entered field, or word `exit` to exit without changes.");
			Pattern ptrn = Pattern.compile(in_string_pattern = br.readLine());
			if( "exit".equals(in_string_pattern) )
			{
				break;
			}
			else
			{				
				System.out.println("Please, enter String in which will find pattern substring.");
				Matcher mtch = ptrn.matcher(br.readLine());
				if(mtch.find())
				{
					System.out.println("Is substring.");
				}
				else
				{
					System.out.println("Not substring.");
				}
			}
		}while(true);
	}

	protected static void parsingNameString(BufferedReader br) throws IOException
	{
		String in_string_field;
		String str_name;
		String str_surname;
		String str_patronymic;

		do
		{
			System.out.println("Please, enter surname, name and patronymic in one field, or word `exit` to exit without changes.");
			Pattern ptrn = Pattern.compile("^*\\.");
			Pattern ptrn_surname = Pattern.compile("[A-Za-z]* ");
			Pattern ptrn_name = Pattern.compile(" [A-Za-z0-9\\_]+\\p{L}{0,10} ");
			Pattern ptrn_mid_name = Pattern.compile(" [A-Za-z]+");
			Pattern ptrn_dot_name = Pattern.compile(" [A-Za-z0-9\\_]+\\p{L}{0,10}");

			in_string_field = (br.readLine()).trim();

			if( "exit".equals(in_string_field))
			{
				break;
			}
			else
			{
				Matcher mtch = null;
				mtch = ptrn.matcher(in_string_field);
				try
				{
					if(mtch.find())
					{
						System.out.println("Exist '.'.");
	
							mtch = null;
							mtch = ptrn_surname.matcher(in_string_field);
							mtch.find();
							System.out.println("Surname: " + (str_surname = (mtch.group()).trim()));
							mtch = ptrn_dot_name.matcher(in_string_field);
							mtch.find();
							System.out.println("Name: " + (str_name = (mtch.group()).trim()));
							mtch=null;
							mtch = ptrn_mid_name.matcher(in_string_field);
							mtch.find();
							System.out.println("Patronymic: " + (str_patronymic = (mtch.group()).trim()));
					}
					else 
					{
							mtch = ptrn_surname.matcher(in_string_field);
							mtch.find();
							System.out.println("Surname: " + (str_name = (mtch.group()).trim()));
							mtch = ptrn_name.matcher(in_string_field);
							mtch.find();
							System.out.println("Name: " + (str_name = (mtch.group()).trim()));
							mtch = ptrn_mid_name.matcher(in_string_field);
							mtch.find();
							System.out.println("Patronymic: " + (str_patronymic = (mtch.group()).trim()));
					}
				}
				catch(IllegalStateException e) 
				{
					System.out.println("Please, enter words in field as follow: 'Surname Name Patronymic' or 'Surname N. P.', or 'exit'.");
				}
			}
		}while(true);
	}
	
	protected static void getMax(String[] arg)
	{
		int max_value = arg.length > 0 ? arg[arg.length-1].length() : 0;
		String big_str = arg[arg.length-1];

		for(int i = arg.length - 1; i >= 0; --i)
		{
			big_str = max_value < arg[i].length() ? arg[i] : big_str;
			max_value = max_value < arg[i].length() ? arg[i].length() : max_value;
			
		}

		System.out.println("Longest word is: " + big_str + " its length is: " + big_str.length());

	}
	
	protected static void patternUScurrency(String str) 
	{
		Pattern ptrn = Pattern.compile("^*\\$[0-9]+\\.[0-9]{0,2}");
		Matcher mtch = ptrn.matcher(str);
		
		while(mtch.find()) 
		{
			System.out.println(mtch.group());
		}
	}
	
}