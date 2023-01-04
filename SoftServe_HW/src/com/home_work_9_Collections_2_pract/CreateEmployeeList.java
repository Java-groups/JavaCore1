package com.home_work_9_Collections_2_pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class CreateEmployeeList
{

	protected static void createEmployeeInstanceList(BufferedReader br, HashMap<Integer, String>employeeMap) throws IOException
	{
		String in_employee_key;
		int employee_key;
		boolean exit = false;

		out:do
		{
			System.out.println("Please, to fill out the employee list and add new employee in it,\nthen enter ID number and name or word `exit` to quit without changes.");
			System.out.println("Please, enter emeployee ID.");
			in_employee_key = br.readLine();
			if("exit".equals(in_employee_key ) )
			{
				exit = true;
			}
			else
			{
				try 
				{
					if( !employeeMap.containsKey(Integer.parseInt(in_employee_key)) &  ( employee_key = Integer.parseInt(in_employee_key) ) > 0) 
					{
						System.out.println("Please, enter employee name.");
						employeeMap.put(employee_key, br.readLine());
						exit = false;
					}
					else
					{
						System.out.println("Employee with same ID number already exist or number less than zero.");
						continue out;
					};
					exit = false;
				}
				catch(NumberFormatException exc)
				{
					System.out.println("Please, enter value greater than zero, or for exit enter: q.");
				}
			}
		}while(!exit);

}

	protected static int checkInFormatIntegerOrExit(String in)
	{
		String in_word = in;

		do 
		{
			try 
			{
				while( !"q".equals(in_word) & Integer.parseInt(in_word) <= 0 )
				{
					System.out.println("Please, enter value greater than zero, or for exit enter: q.");
					
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
				System.out.println("Please, enter value greater than zero, or for exit enter: q.");
			}
		}while(true); 
	}

	protected static int checkInFormatIntegerOrExit(BufferedReader in) throws IOException
	{
		String in_word;

		do 
		{
			System.out.println("Please, enter employee ID and get name if it exist, value greter than zero, or q for exit.");
			try 
			{
				while( !"q".equals(in_word=in.readLine()) & Integer.parseInt(in_word) <= 0 )
				{
					System.out.println("Please, enter value greater than zero, or for exit enter: q.");
					return -1;
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
				System.out.println("Please, enter value greater than zero, or for exit enter: q.");
			}
		}while(true); 
	}

	protected static void showEmployeeList(HashMap<Integer, String> hm) 
	{
		hm.forEach((k, v) -> System.out.println("Employee ID: " + k + ";\t" + "employee name: " + v + ";"));
	}

	protected static String getNameFromID(HashMap<Integer, String> hm, BufferedReader br) throws IOException 
	{
		int ID_num = checkInFormatIntegerOrExit(br);
		return hm.get(ID_num)==null ? "Employee with this ID does not exist in the list." : ( "Employee name: " +hm.get(ID_num) );
	}

	protected static Set<Integer> getIDsFromName(HashMap<Integer, String> hm, BufferedReader br) throws IOException 
	{
		Set<Integer> null_set = new HashSet<Integer>();
		null_set.add(0);
		System.out.println("Please, enter employee name to get IDs.");
		String employee_name = br.readLine();
		return !hm.containsValue(employee_name) ? null_set : hm.entrySet().stream().filter(t -> Objects.equals(t.getValue(), employee_name)).map(Map.Entry :: getKey).collect(Collectors.toSet());
	}	
}