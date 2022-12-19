package com.home_work_5_OOP_1;

public class Eagle extends FlyingBird
{
	private String eagleName;

	public Eagle(String eagleName)
	{
		this.eagleName = eagleName;
	}

	public String getEagleName()
	{
		return eagleName;
	}

	public void setEagleName(String eagleName)
	{
		this.eagleName = eagleName;
	}

	@Override
	protected String fly()
	{
		return "Chicken with name " + getEagleName() + " had flied.";
	}
	
	
}