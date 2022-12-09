package com.home_work_2_oop_intro;


import java.util.HashMap;
import java.util.Scanner;
import java.time.Year;

public class Person 
{
	private String firstName; 
	private String lastName;
	private int  birthYear;

	private static int count = 0;

	private HashMap<Integer,Person> new_person_list = new HashMap<Integer,Person>();

	public Person() 
	{
		
	}

	public Person(String firstName) 
	{
		this.firstName = firstName;
		count++;
	}

	public Person(int birthYear) 
	{
		this.birthYear = birthYear;
		count++;
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

	public void setBirthYear(Scanner sc) 
	{
		this.birthYear = checkInFormatIntOrExit(sc);
	}

	public void setBirthYear(int birthYear) 
	{
		this.birthYear = birthYear;
	}
		
	public int getAge() 
	{
		return Year.now().getValue() - this.birthYear;
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
		
	//added new method for output info of persons in whole list of persons that was added
	public void out() 
	{
		for (int i = 0; i < new_person_list.size(); i++) 
		{
			System.out.print((i + 1)+ ". First Name: " + new_person_list.get(Integer.valueOf(i)).getFirstName()+";");
			System.out.print("\tLast Name: " + new_person_list.get(Integer.valueOf(i)).getLastName()+";");
			System.out.print("\tBirth Year: " + new_person_list.get(Integer.valueOf(i)).getBirthYear()+";");
			System.out.println("\tAge: " + new_person_list.get(Integer.valueOf(i)).getAge());
		}
	}
		
		
	public void output() 
	{
			System.out.print("First Name: " + this.firstName);
			System.out.print("\tLast Name: " + this.lastName);
			System.out.print("\tBirth Year: " + this.birthYear);
			System.out.println("\tAge: " + getAge());
	}


	public void fillOutPersonList(Scanner sc)
	{
		boolean exit;
		String  in_person_name;
		do
		{
			System.out.println("Please, to fill out the persons list and add new person in it, enter Name and then LastName, or word `exit` to quit without changes.");
			if("exit".equals(in_person_name=sc.next())) 
			{
				exit=true;
			}
			else
			{
				new_person_list.put(Integer.valueOf(Person.count),new Person(in_person_name));
				System.out.println("Please, enter LastName of new person.");
				new_person_list.get(Integer.valueOf(Person.count-1)).setLastName(sc.next());
				new_person_list.get(Integer.valueOf(Person.count-1)).setBirthYear(sc);
				exit=false;
			}

		}while(!exit);
	}


	private int checkInFormatIntOrExit(Scanner in)
	{
		String in_word;
		do 
		{
			System.out.println("Please, enter person birth year, or `q` for exit.");
			try 
			{
				while( !"q".equals(in_word=in.next()) && Integer.parseInt(in_word)<=0 )
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