package com.home_work_4_Loops_pract;

import java.util.*;
import java.util.Map.Entry;


public class Employee 
{

	private String name;
	private int department;
	private double salary;
	private static int count=0;


	private static HashMap<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
	private static HashMap<String, Double> employeeNameSalaryMap = new HashMap<String, Double>();
	private static HashMap<String, Integer> employeeNameDepNumbMap = new HashMap<String, Integer>();


	public Employee(String name) 
	{
		this.name = name;
		count++;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getDepartment() 
	{
		return department;
	}
	public void setDepartment(int department) 
	{
		this.department = department;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	protected static void createDogInstanceList(Scanner sc)
	{
		boolean exit = false;
		String  in_employee_name;
		double  in_emp_salary;
		int depart;

	out:do
		{
			System.out.println("Please, to fill out the employee list and add new employee in it,\nenter name, salary and then department or word `exit` to quit without changes.");

			if("exit".equals( in_employee_name = sc.next()) ) 
			{
				exit = true;
			}
			else
			{
				if( !employeeMap.containsKey(count)) 
				{
					employeeMap.put(Integer.valueOf(count), new Employee(in_employee_name) );
				}
				else
				{
					System.out.println("Employee with same number already exist.");
					continue out;
				};

				System.out.println("Please, enter new employee salary.");
				in_emp_salary = CheckInput.checkInFormatIntegerOrExit(sc);
				employeeMap.get(count-1).setSalary(in_emp_salary);

				System.out.println("Please, enter new employee department.");
				depart = CheckInput.checkInFormatIntegerOrExit(sc);
				employeeMap.get(count-1).setDepartment(depart);
				employeeNameSalaryMap.put(in_employee_name, in_emp_salary);
				employeeNameDepNumbMap.put(in_employee_name, depart); 
				
				exit = false;
			}
		}while(!exit);


	//employeeMap.forEach((k, v) -> System.out.println(k + ".\t\t" + "Name: " + v.getName() + ";\t\t" + v.getSalary() + ";\t\t" + v.getDepartment() + ";"));

	}

	protected static void getSortedList()
	{
		count = 0;

		List<Entry<String, Double>> list = new LinkedList<Entry<String, Double>>(employeeNameSalaryMap.entrySet());

		Collections.sort(list, (l1, l2) ->  l2.getValue().compareTo(l1.getValue()));

		for(int i=0; i < list.size(); i++) 
		{
			System.out.println("Name: " + list.get(i).getKey() + ";\t\tSalary" + list.get(i).getValue());
		}

	}

	protected static void getEmployeeByDepart(Scanner sc)
	{
		int depart_number = 0;
		System.out.println("Please, enter number of department.");
		depart_number = CheckInput.checkInFormatIntegerOrExit(sc);
		for(Map.Entry<String, Integer> map : employeeNameDepNumbMap.entrySet())
		{
			if(map.getValue() == depart_number)
			{
				System.out.println("Name: " + map.getKey() + ";\t\tDepartment: " + map.getValue());
			}
		}

	}
}