package com.home_work_7_NestedInnerClasses;

import java.io.BufferedReader;
import java.io.IOException;

abstract class Person
{
	private FullName fullName;
	private int age;
	private static int count;

	Person(FullName fullName, int age)
	{
		this.fullName = fullName;
		this.age = age;
		count++;
	}

	public static int getCount()
	{
		return count;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	abstract public String activity();

	public String info() 
	{
		return "First name: " + fullName.getFirstName() + ";\tLast name: " + fullName.getLastName() + ";\tAge: " + this.age + ";";
	}

	public FullName getFullName()
	{
		return fullName;
	}

	public void setFullName(FullName fullName)
	{
		this.fullName = fullName;
	}
	
	protected static int checkInFormatIntOrExit(BufferedReader in) throws IOException
	{
		String in_word;
		do 
		{
			System.out.println("Please, enter department building, or `q` for exit.");
			try 
			{
				while( !"q".equals(in_word=in.readLine()) && Integer.parseInt(in_word)<=0 )
				{
					System.out.println("Please, enter integer value greater than zero, or `q`.");					
				}
				if ("q".equals(in_word)) 
				{
					return -1;
				}
				else 
				{
					return Integer.parseInt(in_word);
				}
			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter integer value greater than zero, or for exit enter: q.");
			}
		}while(true); 
	}

}