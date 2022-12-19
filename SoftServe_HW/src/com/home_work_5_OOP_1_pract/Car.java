package com.home_work_5_OOP_1_pract;

public class Car 
{
	String model;
	int maxSpeed;
	int yearManufacture;


	public Car(String model) 
	{
		this.model = model;
	}

	public String getModel() 
	{
		return model;
	}

	public void setModel(String model) 
	{
		this.model = model;
	}

	public int getMaxSpeed() 
	{
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) 
	{
		this.maxSpeed = maxSpeed;
	}

	public int getYearManufacture() 
	{
		return yearManufacture;
	}

	public void setYearManufacture(int yearManufacture) 
	{
		this.yearManufacture = yearManufacture;
	}

}