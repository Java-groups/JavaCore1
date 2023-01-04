package com.home_work_7_NestedInnerClasses_pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

public class Department
{
	private String name;
	private Address address;
	private static int count;

	Department(String name)
	{
		this.name = name;
		Department.count++;
		CreateAddressInstance();
	}

	public Address CreateAddressInstance() 
	{
		address	= new Address();
		return this.address;
	}
	public void setStreet(String street) 
	{
		this.address.setStreet(street);
	}
	public String getStreet() 
	{
		return (this.address).getStreet();
	}
	public void setCity(String city) 
	{
		this.address.setCity(city);
	}
	public String getCity() 
	{
		return (this.address).getCity();
	}
	public  int getBuilding() 
	{
		return (this.address).getBuilding();
	}
	public void setBuilding(int buiding) 
	{
		this.address.setBuilding(buiding);
	}


	private class Address
	{
		private String city;
		private String street;
		private int building;


		private void setCity(String city) 
		{
			this.city = city;
		}
		private String getCity() 
		{
			return this.city;
		}
		private String getStreet() 
		{
			return street;
		}
		private void setStreet(String street) 
		{
			this.street = street;
		}
		private int getBuilding() 
		{
			return building;
		}
		private void setBuilding(int building) 
		{
			this.building = building;
		}
	}

	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public Address getAddress() 
	{
		return this.address;
	}

	protected static void createDepartmentList(BufferedReader sc_1, HashMap<Integer, Department> department_map_list) throws IOException
	{
		boolean exit = false;
		String  in_department_name;
		String  in_department_city;
		String in_department_street;
		int in_department_building;

		do
		{
			System.out.println("Please, to fill out the department list and add new department in it, first enter name and then city, street and building or word `exit` to quit without changes.");
			System.out.println("Please, enter department name.");
			while((in_department_name = sc_1.readLine()).isEmpty()) 
			{
				System.out.println("Please, enter departmen name, because field is empty.");
			}
			if("exit".equals(in_department_name)) 
			{
				exit = true;
			}
			else
			{

				department_map_list.put(count, new Department(in_department_name));

				System.out.println("Please, enter department city.");

				while((in_department_city = sc_1.readLine()).isEmpty()) 
				{
					System.out.println("Please, enter departmen city, because field is empty.");
				}
				department_map_list.get(count-1).setCity(in_department_city);

				System.out.println("Please, enter department street.");

				while((in_department_street = sc_1.readLine()).isEmpty()) 
				{
					System.out.println("Please, enter departmen street, because field is empty.");
				}
				department_map_list.get(count-1).setStreet(in_department_street);

				System.out.println("Please, enter department building.");

				while((in_department_building = checkInFormatIntOrExit(sc_1)) < 0)
				{
					System.out.println("Please, enter departmen building, because field is empty.");
				}
				department_map_list.get(count-1).setBuilding(in_department_building);

				exit = false;
			}

		}while(!exit);

		department_map_list.forEach((k, v) -> System.out.println(k+1 + ". " + "Department name: " + department_map_list.get(k).getName() + ";\t\tCity: " + department_map_list.get(k).getCity() + ";\tStreet: " + department_map_list.get(k).getStreet() + ";\tBuilding: " + department_map_list.get(k).getBuilding()));

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