package com.home_work_7_NestedInnerClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

public class Student extends Person
{
	private int course;

	Student(FullName fullName, int age, int course)
	{
		super(fullName, age);
		this.course = course;
	}

	public int getCourse()
	{
		return course;
	}

	@Override
	public String info() 
	{
		return super.info() + "\t Course" + course + ";";
	}

	@Override
	public String activity() 
	{
		return "Student learning course " + course + ".";
	}

	protected void fillOutStudentList(BufferedReader sc, HashMap<Integer, Person> new_person_list) throws IOException
	{
		boolean exit;
		String  in_person_first_name;
		int student_age;
		do
		{
			System.out.println("Please, to fill out the persons list and add new person in it, enter Name and then LastName, or word `exit` to quit without changes.");
			if("exit".equals(in_person_first_name = sc.readLine())) 
			{
				exit = true;
			}
			else
			{

				setFullName(new FullName(in_person_first_name));

				System.out.println("Please, enter student last name.");
				getFullName().setLastName(sc.readLine());

				System.out.println("Please, enter student age.");
				student_age = Person.checkInFormatIntOrExit(sc);

				System.out.println("Please, enter student course.");

				new_person_list.put(Integer.valueOf(Person.getCount()-1), new Student(getFullName(), student_age, Person.checkInFormatIntOrExit(sc)));

				exit=false;
			}

		}while(!exit);
	}

	public static void showStudentsInfo(HashMap<Integer, Person> new_person_list)
	{
		new_person_list.forEach((k, v) -> { System.out.println(((Student) v).info()); });
	}

}