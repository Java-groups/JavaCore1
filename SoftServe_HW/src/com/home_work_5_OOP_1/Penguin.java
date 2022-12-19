package com.home_work_5_OOP_1;

public class Penguin extends NonFlyingBird
{
	private String penguinName;

	public Penguin(String penguinName)
	{
		this.penguinName = penguinName;
	}

	public String getPenguinName()
	{
		return penguinName;
	}

	public void setPenguinName(String penguinName)
	{
		this.penguinName = penguinName;
	}

	@Override
	protected String fly()
	{
		return "Chicken with name " + getPenguinName() + " had flied.";
	}
	
	
}