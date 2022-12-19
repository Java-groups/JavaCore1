package com.home_work_5_OOP_1_pract;

public class ColorLine extends Line
{
	private String color = "no color";

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	protected String print()
	{
		return "X1: " + getX_1() + "\tY1: " + getY_1() + "\tX2: " + getX_2() + "\tY2: " + getY_2() + ";" + "Color: " + getColor();
	}

	@Override
	public String toString()
	{
		return "ColorLine [color=" + color + "]";
	}

}