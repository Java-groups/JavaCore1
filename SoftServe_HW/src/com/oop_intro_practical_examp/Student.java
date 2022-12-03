package com.oop_intro_practical_examp;

public class Student 
{


	private static int count = 0;
	private static double sum = 0;
	private String name;
	private double rate=0;



	public Student(String name, double rate) 
	{
		this.name = name;
		this.rate = rate;
		//count++;
	}	
	public Student(String name) 
	{
		this.name = name;
		count++;
	}
	public Student(double rate) 
	{
		this.rate = rate;
		//count++;
	}
	public static double avgRating() 
	{
		if (count != 0) 
		{
			return sum/count;
		}
		else
		{
			System.out.println("Divide by zero.");
			return -1;
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
	public double getRate() 
	{
		return rate;
	}
	public void setRate(double rate) 
	{

		sum = sum - this.rate + rate;
		this.rate = rate;
	}
	
	public static int getCount() 
	{
		return count;
	}
	public boolean betterStudent(Student s)
	{
		if(this.rate > s.getRate()) 
		{
			return true;
		}
		else
		{
			return false;
		}	
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rate=" + rate + "]";
	}
}