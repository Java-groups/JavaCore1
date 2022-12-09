package com.home_work_3_Conditions;

import java.util.HashMap;

public enum Breed 
{
	Breed_1(1,"American Bulldog"),
	Breed_2(2,"American Eskimo Dog"),
	Breed_3(3,"American Hairless Terrier"),
	Breed_4(4,"American Foxhound"),
	Breed_5(5,"American Staffordshire Terrier"),
	Breed_6(6,"American Water Spaniel"),
	Breed_7(7,"Alaskan Malamute"),
	Breed_8(8,"Australian Shepherd"),
	Breed_9(9,"Black and Tan Coonhound"),
	Breed_10(10,"Bluetick Coonhound"),
	Breed_11(11,"Boston Terrier"),
	Breed_12(12,"Boykin Spaniel"),
	Breed_13(13,"Carolina Dog"),
	Breed_14(14,"Catahoula Leopard Dog"),
	Breed_15(15,"Chesapeake Bay Retriever"),
	Breed_16(16,"Miniature American Shepherd"),
	Breed_17(17,"Mountain Cur"),
	Breed_18(18,"Rat Terrier"),
	Breed_19(19,"Toy Fox Terrier"),
	Breed_20(20,"Treeing Walker Coonhound");

	private int p1;
	private String p2;
	private static HashMap<Integer, String> breedMap = new HashMap<Integer, String>();

	private Breed(int p1, String p2)
	{
		this.p1 = p1;
		this.p2 = p2;
	}

	public int getP1() 
	{
		return p1;
	}

	public String getP2() 
	{
		return p2;
	}

	private static void buffer()
	{
		for(int i=0;i < Breed.values().length; i++) 
		{
			breedMap.put( Breed.values()[i].getP1(), Breed.values()[i].getP2());
		}
	}

	protected static String getDogBreed(int dogBreed) 
	{
		buffer();
		return breedMap.get(dogBreed);
	}

	protected static void showBreedsInfo()
	{
		buffer();
		System.out.println("Select the dog breed end then enter it number.");
		breedMap.forEach((k, v) -> System.out.println(k + ". " + " " + v));
	}
}