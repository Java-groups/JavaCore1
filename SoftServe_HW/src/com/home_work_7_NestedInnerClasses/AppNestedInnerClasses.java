package com.home_work_7_NestedInnerClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class AppNestedInnerClasses 
{
	public static void main(String[] args) throws IOException
	{
		HashMap<Integer, Person> students_map = new HashMap<Integer, Person>();
		BufferedReader br_1 = new BufferedReader(new InputStreamReader(System.in));

		Student st_1 = new Student(new FullName("basic_student_first_name", "basic_student_last_name"), 0, 0);
		st_1.fillOutStudentList(br_1, students_map);
		Student.showStudentsInfo(students_map);

		br_1.close();
	}
}