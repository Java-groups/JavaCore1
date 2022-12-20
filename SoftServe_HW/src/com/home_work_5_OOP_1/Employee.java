package com.home_work_5_OOP_1;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;

public class Employee
{

	private String name;
	private String department;
	private double salary;

	private static int count=0;


	private static HashMap<Integer, Object> employeeMap = new HashMap<Integer, Object>();

	public Employee(BufferedReader br, String emp_type) throws IOException
	{
		createEmployeeInstanceList(br, emp_type);
	}

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
	public String getDepartment() 
	{
		return department;
	}
	public void setDepartment(String depart) 
	{
		this.department = depart;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	protected static void createEmployeeInstanceList(BufferedReader br, String employee_type) throws IOException
	{
		String  in_employee_name;
		double  in_emp_salary;
		String depart;

			System.out.println("Please, to fill out the employee list and add new " + employee_type + "in it,\nenter name, salary and then department or word `exit` to quit without changes.");
			in_employee_name = br.readLine();

			if( !employeeMap.containsKey(count)) 
			{
				employeeMap.put(Integer.valueOf(count), new Employee(in_employee_name) );
				
				System.out.println("Please, enter new employee salary.");
				in_emp_salary = CheckInput.checkInFormatIntegerOrExit(br);
				((Employee) employeeMap.get(count-1)).setSalary(in_emp_salary);

				System.out.println("Please, enter new employee department.");
				depart = br.readLine();
				((Employee) employeeMap.get(count-1)).setDepartment(depart);

			}
			else
			{
				System.out.println("Employee with same number already exist.");
			};

	}

	protected String report() 
	{
		return "Name: " + ((Employee) employeeMap.get(count-1)).getName() + "; Department: " + ((Employee) employeeMap.get(count-1)).getDepartment() + "; Salary: " + ((Employee) employeeMap.get(count-1)).getSalary() + ";";
	}

}