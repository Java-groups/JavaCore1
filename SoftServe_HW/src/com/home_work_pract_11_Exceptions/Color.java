package com.home_work_pract_11_Exceptions;

public enum Color
{
	RED("Червоний"),
	ORANGE("Помаранчевий"),
	YELLOW("Жовтий"),
	GREEN("Зелений"),
	AZURE("Блакитний"),
	BLUE("Синій"),
	VIOLET("Фіолетовий");
	
	private Color(String color) 
	{
		this.color = color;
	}
	
	private final String color;

	public static int getColorNumber(String color_name) throws ColorException
	{
		switch(color_name) 
		{
			case "RED": 	return 0;
			case "ORANGE": 	return 1;
			case "YELLOW": 	return 2;
			case "GREEN": 	return 3;
			case "AZURE": 	return 4;
			case "BLUE": 	return 5;
			case "VIOLET": 	return 6;
			default: throw new ColorException("Color not exist.");
		}
	}

	public String getColor()
	{
		return this.color;
	}

}