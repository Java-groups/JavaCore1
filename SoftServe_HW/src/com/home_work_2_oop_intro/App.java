package com.home_work_2_oop_intro;

import java.util.Scanner;

public class App 
{
	public static void main(String[] args)
	{



		/*

		//creating Person instances and fill out info with constructor of class and method setBirthYear()

		Person p1 = new Person("John","Doe");
		p1.setBirthYear(1980);
		p1.changeName("Chris", "Davies");
		p1.output();

		Person p2 = new Person("Connor","Smith");
		p2.setBirthYear(1990);
		p2.output();

		Person p3 = new Person("Robert","Stahowski");
		p3.setBirthYear(1992);
		p3.output();

		Person p4 = new Person("Jeremi","Thomas");
		p4.setBirthYear(1994);
		p4.output();

		Person p5 = new Person("Osmond ","Hughes");
		p5.setBirthYear(1996);
		p5.output();

		*/



		//creating class Person instances with constructor and fill out person info with method input()
		Scanner in_scanner_1 = new Scanner(System.in);

		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();

		p1.input(in_scanner_1);
		p1.output();
		p2.input(in_scanner_1);
		p2.output();
		p3.input(in_scanner_1);
		p3.output();
		p4.input(in_scanner_1);
		p4.output();
		p5.input(in_scanner_1);
		p5.output();

		in_scanner_1.close();





	}
}