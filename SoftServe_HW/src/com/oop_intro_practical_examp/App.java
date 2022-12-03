package com.oop_intro_practical_examp;

public class App 
{


	public static void main(String[] args) 
	{


		Student st_1 = new Student("Robert");
		st_1.setRate(4);
		st_1.setRate(4.2);

		Student st_2 = new Student("Daniel");
		st_2.setRate(4.2);
		st_2.setRate(4.4);

		Student st_3 = new Student("Connor");
		st_3.setRate(4.4);

		System.out.println(st_1.betterStudent(st_2));
		System.out.println(st_3.betterStudent(st_1));
		System.out.printf("%2.2f",Student.avgRating());
		System.out.println("\n"+st_1.toString());
		System.out.println(st_2.toString());
		System.out.println(st_3.toString());

	}

}
