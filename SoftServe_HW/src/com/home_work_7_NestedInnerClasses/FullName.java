package com.home_work_7_NestedInnerClasses;

public class FullName
{

	String firstName;
	String lastName;

	public FullName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public FullName(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

}