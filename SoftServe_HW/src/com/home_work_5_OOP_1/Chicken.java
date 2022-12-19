package com.home_work_5_OOP_1;

public class Chicken extends NonFlyingBird
{
	private String chickenName;

	public Chicken(String chickenName)
	{
		this.chickenName = chickenName;
	}

	public String getChickenName()
	{
		return chickenName;
	}

	public void setChickenName(String chickenName)
	{
		this.chickenName = chickenName;
	}

	@Override
	protected String fly()
	{
		return "Chicken with name " + getChickenName() + " had flied.";
	}


}