package com.home_work_2_oop_intro_practical;

public class Employee 
{
	private String  name;
	private double  rate=0,
					hours=0;
	private static double totalSum=0,
						  rateTempo;

	
	public Employee()
	{
		
	}

	public Employee(String name)
	{
		this.name = name;
	}

	public Employee(double rate) 
	{
		this.rate = rate;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getRate() 
	{
		return rate;
	}

	public void setRate(double rate) 
	{
		rateTempo = rate;
		this.rate = rate;
	}

	public double getHours() 
	{
		return hours;
	}

	public void setHours(double hours) 
	{
		totalSum = totalSum - this.rate*this.hours + rateTempo*hours;
		this.hours = hours;
	}

	public static double getTotalSum() 
	{
		return totalSum;
	}

	public double getSalary() 
	{
		return this.rate*this.hours;
	}

	public double getBonuses() 
	{
		return this.rate*this.hours*0.1;
	}

	@Override
	public String toString() 
	{
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
}
