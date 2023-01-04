package com.home_work_9_Collections_2_HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.TreeMap;

public class CreatePersonsList
{

	protected static void createPersonList(BufferedReader br, TreeMap<String, String> personMap) throws IOException
	{
		String in_person_lastName;
		String str;
		boolean exit = false;

	out:do
		{
			System.out.println("Please, to fill out the person list and add new person in it,\nthen enter Last Name and First Name or word `exit` to quit without changes.");
			System.out.println("Please, enter person Last Name.");
			in_person_lastName = ( (str = br.readLine()).isEmpty() ) ? "empty" : str;
			if( "exit".equals(in_person_lastName ) )
			{
				exit = true;
			}
			else
			{				
				if( !personMap.containsKey(in_person_lastName) & !"empty".equals(in_person_lastName))
				{
					System.out.println("Please, enter employee First Name.");
					personMap.put(in_person_lastName, ((str=br.readLine()).isEmpty()) ? "empty" : str);
					exit = false;
				}
				else
				{
					System.out.println("Employee with same Last Name already exist or field Name is empty.");
					continue out;
				};
				exit = false;
			}
		}while(!exit);
	}

	protected static void showPersonsNames(TreeMap<String, String> tm)
	{
		tm.forEach((firstName, lastName) -> System.out.println("Person Last Name: " + firstName + "; Person First Name: " + lastName));
	}

	protected static void removeFieldWithName(TreeMap<String, String> tm, String firstName)
	{
		tm.values().remove(firstName);
	}

}