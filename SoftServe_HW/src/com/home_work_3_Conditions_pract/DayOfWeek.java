package com.home_work_3_Conditions_pract;

public enum DayOfWeek
{

	MONDAY("MONDAY","����Ĳ���"),
	TUESDAY("TUESDAY","²������"),
	WEDNESDAY("WEDNESDAY","������"),
	THURSDAY("THURSDAY","������"),
	FRIDAY("FRIDAY","�'������"),
	SATURDAY("SATURDAY","������"),
	SUNDAY("SUNDAY","��Ĳ��");

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