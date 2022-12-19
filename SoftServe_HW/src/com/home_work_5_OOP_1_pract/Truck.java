package com.home_work_5_OOP_1_pract;

public class Truck extends Car
{
	private static String carBodyType = "truck";

	public Truck(String model) 
	{
		super(model);
		CreateCarList.count++;
	}
}