package com.home_work_5_OOP_1;

public class Swallow extends FlyingBird
{
	private String swallowName;

	public Swallow(String swallowName)
	{
		this.swallowName = swallowName;
	}

	public String getSwallowName()
	{
		return swallowName;
	}

	public void setSwallowName(String swallowName)
	{
		this.swallowName = swallowName;
	}

	@Override
	protected String fly()
	{
		return "Chicken with name " + getSwallowName() + " had flied.";
	}
	
	
}