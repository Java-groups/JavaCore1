package com.home_work_2_oop_intro;

import java.util.Scanner;

public class App 
{
	public static void main(String[] args)
	{



		
		//creating class Person instances with constructor and fill out person info with method fillOutPersonList()
		Scanner in_scanner_1 = new Scanner(System.in);


		Person person_list = new Person();
		person_list.fillOutPersonList(in_scanner_1);
		person_list.out();


		in_scanner_1.close();




		
		/*
		
		//-----------------------------------------------------------------------------------------------
		//creating Person instances and fill out info with constructor of class and method setBirthYear()
		Person p1 = new Person("John");
		p1.setLastName("Doe");
		p1.setBirthYear(1980);
		p1.setFirstName("Chris");
		p1.setLastName("Davies");
		p1.output();
		Person p2 = new Person("Connor");
		p2.setLastName("Smith");
		p2.setBirthYear(1990);
		p2.output();
		Person p3 = new Person("Robert");
		p3.setLastName("Stahowski");
		p3.setBirthYear(1992);
		p3.output();
		Person p4 = new Person("Jeremi");
		p4.setLastName("Thomas");
		p4.setBirthYear(1994);
		p4.output();
		Person p5 = new Person("Osmond");
		p5.setLastName("Hughes");
		p5.setBirthYear(1996);
		p5.output();
		
		
		*/

	}
}