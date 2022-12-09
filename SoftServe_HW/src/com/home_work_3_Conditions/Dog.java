package com.home_work_3_Conditions;

import java.util.HashMap;
import java.util.Scanner;

public class Dog 
{
	private String name="";
	private int breed=0;
	private int age=0;

	private static int count;

	private static HashMap<String, Dog> name_dog_list = new HashMap<String, Dog>();
	private static HashMap<String, Integer> name_age_dog_list = new HashMap<String, Integer>();
	private static HashMap<String, String> name_breed_dog_list = new HashMap<String, String>();

	public Dog(String name) 
	{
		this.name = name;
		count++;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getBreed() 
	{
		return breed;
	}

	public void setBreed(int breed) 
	{
		this.breed = breed;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	protected static void createDogInstanceList(Scanner sc)
	{
		boolean exit = false;
		String  in_dog_name;
		int  in_dog_breed;
		int localAge;

	out:do
		{
			System.out.println("Please, to fill out the dogs list and add new dog in it,\nenter name, age and then breed or word `exit` to quit without changes.");

			if("exit".equals( in_dog_name = sc.next()) ) 
			{
				exit=true;
			}
			else
			{
				if( !name_dog_list.containsKey(in_dog_name) ) 
				{
					name_dog_list.put( in_dog_name, new Dog(in_dog_name) );
				}
				else
				{
					System.out.println("Dog with same name already exist.");
					continue out;
				};

				System.out.println("Please, enter new dog age.");
				name_dog_list.get(in_dog_name).setAge( localAge = CheckCondition.checkInFormatIntOrExit(sc) );

				Breed.showBreedsInfo();
				in_dog_breed = CheckCondition.checkInFormatIntOrExit(sc);
				name_dog_list.get(in_dog_name).setBreed(in_dog_breed);
				name_breed_dog_list.put(in_dog_name, Breed.getDogBreed(in_dog_breed));
				name_age_dog_list.put(in_dog_name, localAge);

				exit=false;
			}
		}while(!exit);
	}

	private static int i=0;
	private static String olderDogName="";
	private static int olderDogAge=0;

	protected static int getOlderDogAge() 
	{
		i=0;
		double[] dogsAge = new double [name_age_dog_list.size()];

		name_age_dog_list.forEach((k, v) -> dogsAge[i++] = v);

		return olderDogAge = (int) CheckCondition.getMax(dogsAge);
	}

	protected static String getOlderDogName() 
	{ 
		name_age_dog_list.forEach((k,v) -> {if(olderDogAge == v) {olderDogName = k;} });
		return olderDogName;
	}
	
	protected static String getOlderDogBreed() 
	{
		name_age_dog_list.forEach((k, v) -> {if(v == olderDogAge) olderDogName = k;} );
		return name_breed_dog_list.get(olderDogName);
	}

	protected static void showDogs()
	{
		i=1;
		name_dog_list.forEach((k, v) -> System.out.println(i++ + ". Name: " + v.getName() + "; \t\tAge: " + v.getAge() + "; \tBreed: " +  Breed.getDogBreed(v.getBreed()) ));
	}

}