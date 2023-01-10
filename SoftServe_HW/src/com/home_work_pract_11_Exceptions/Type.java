package com.home_work_pract_11_Exceptions;

public enum Type
{
	WILDFLOWER("Польова квітка"),
	THISTLE("Розторопша"),
	FLOWER("Квітка"),
	HERB("Трава"),
	MUSHROOM("Гриб"),
	WEED("Бур'ян"),
	FERN("Папороть"),
	CATTALI("Рогоза"),
	REED("Очерет"),
	BAMBOO("Бамбук"),
	IVY("Плющ"),
	SHRUB("Чагарник"),
	MOSS("Мох"),
	GRASS("Трава"),
	PALMTREE("Пальма"),
	BUSH("Кущ"),
	CORN("Кукурудза"),
	TREE("Дерево");

	private Type(String p_type) 
	{
		this.plant_type = p_type;
	}

	private String plant_type;

	public static int getTypeNumber(String type_name) throws TypeException
	{
		switch(type_name) 
		{
			case "WILDFLOWER" :	return 0;
			case "THISTLE" : 	return 1;
			case "FLOWER" : 	return 2;
			case "HERB" : 		return 3;
			case "MUSHROOM" : 	return 4;
			case "WEED" : 		return 5;
			case "FERN" : 		return 6;
			case "CATTALI" : 	return 7;
			case "REED" : 		return 8;
			case "BAMBOO" : 	return 9;
			case "IVY" : 		return 10;
			case "SHRUB" : 		return 11;
			case "MOSS" : 		return 12;
			case "GRASS" : 		return 13;
			case "PALMTREE" : 	return 14;
			case "BUSH" : 		return 15;
			case "CORN" : 		return 16;
			case "TREE" : 		return 17;
			default: throw new TypeException("Type not exist.");
		}
	}

	public String getPlant_type()
	{
		return plant_type;
	}

}