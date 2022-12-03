package com.home_work_2_oop_intro;

import java.util.Scanner;

public class Person 
{
	private String firstName, 
				   lastName;
	private int  birthYear;


	public Person() 
	{
			
	}

	public Person(String firstName, String lastName) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person(int birthYear) 
	{
		this.birthYear = birthYear;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public int getBirthYear() 
	{
		return birthYear;
	}

	public void setBirthYear(int birthYear) 
	{
		this.birthYear = birthYear;
	}

	public int getAge() 
	{
		return 2022-this.birthYear;
	}

	public void changeName(String fn, String ln)
	{
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public void input(Scanner in_sc)
	{
		System.out.println("Please, enter person first name: ");
		this.firstName = in_sc.next();
		System.out.println("Please, enter person last name: ");
		this.lastName = in_sc.next();
		this.birthYear = checkInFormatIntOrExit(in_sc);
	}

	public void output() 
	{
		System.out.println("Person first name is: "+this.firstName);
		System.out.println("Person last name is: "+this.lastName);
		System.out.println("Person age is: "+this.getAge());
	}
	
	private int checkInFormatIntOrExit(Scanner in)
	{
		String in_word;
		 do 
		{
			System.out.println("Please, enter person birth year, or q for exit.");
			try 
			{
				if ("q".equals(in_word=in.next())) 
				{
					return 0;
				}
				else 
				{
					return Integer.parseInt(in_word);
				}
			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter numeric value, or for exit enter: q.");
			}
		}while(true); 
	}
}
