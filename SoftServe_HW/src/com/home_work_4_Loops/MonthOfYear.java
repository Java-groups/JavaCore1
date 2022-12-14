package com.home_work_4_Loops;

public enum MonthOfYear 
{
	Month_1(1,"January"),
	Month_2(2,"Febrary"),
	Month_3(3,"March"),
	Month_4(4,"April"),
	Month_5(5,"May"),
	Month_6(6,"June"),
	Month_7(7,"July"),
	Month_8(8,"August"),
	Month_9(9,"September"),
	Month_10(10,"October"),
	Month_11(11,"November"),
	Month_12(12,"December");

	private int p1;
	private String p2;

	MonthOfYear(int p1, String p2)
	{
		this.p1 = p1;
		this.p2 = p2;
	}
	
	protected void getValueOf() 
	{
		System.out.println(MonthOfYear.values()[0].p2);
	}

	public int getP1() {
		return p1;
	}

	public void setP1(int p1) {
		this.p1 = p1;
	}

	public String getP2() {
		return p2;
	}

	public void setP2(String p2) {
		this.p2 = p2;
	}

}