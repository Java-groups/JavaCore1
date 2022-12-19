package com.home_work_5_OOP_1;

import java.io.BufferedReader;
import java.io.IOException;

public class Developer extends Employee
{
	private String position;

	public Developer(BufferedReader br, String emp_type, String position) throws IOException
	{
		super(br, emp_type);
		System.out.println("Please, enter developer position.");
		setPosition(position);
	}

	public String getPosition()
	{
		return position;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}
	
	@Override
	public String report() 
	{
		return  super.report() + " Position: " + position;
	}

}