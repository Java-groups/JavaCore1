package com.home_work_3_Conditions_pract;

public enum DayOfWeek
{

	MONDAY("MONDAY","онмед╡кнй"),
	TUESDAY("TUESDAY","б╡брнпнй"),
	WEDNESDAY("WEDNESDAY","яепедю"),
	THURSDAY("THURSDAY","вербеп"),
	FRIDAY("FRIDAY","о'ърмхжъ"),
	SATURDAY("SATURDAY","ясанрю"),
	SUNDAY("SUNDAY","мед╡къ");

	private DayOfWeek(String p1, String p2) 
	{
		this.p1 = p1;
		this.p2 = p2;
	}

	private final String p1;
	private final String p2;

	public String getP1() 
	{
		return p1;
	}
	public String getP2()
	{
		return p2;
	}


}