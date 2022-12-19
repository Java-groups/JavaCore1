package com.home_work_5_OOP_1_pract;

public class Sedan extends Car 
{
	private static String carBodyType = "sedan";

	public Sedan(String model) 
	{
		super(model);
		CreateCarList.count++;
	}
}