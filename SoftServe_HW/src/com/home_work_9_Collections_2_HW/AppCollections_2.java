package com.home_work_9_Collections_2_HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;

public class AppCollections_2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br_1 = new BufferedReader(new InputStreamReader(System.in));
		TreeMap<String, String> personMap = new TreeMap<String, String>();
		TreeMap<Integer, Student> studentMap = new TreeMap<Integer, Student>();

		Set<String> Set1 = new LinkedHashSet<String>();
		Set<String> Set2 = new LinkedHashSet<String>();

		Set1.add("A");
		Set1.add("B");
		Set1.add("C");
		Set1.add("D");
		Set1.add("E");

		Set2.add("A");
		Set2.add("3");
		Set2.add("B");
		Set2.add("C1");
		Set2.add("E");

		System.out.println(TwoPreFieldSets.UnionTwoSets(Set1, Set2).toString());

		System.out.println(TwoPreFieldSets.IntersectionTwoSets(Set1, Set2));

		CreatePersonsList.createPersonList(br_1, personMap);

		CreatePersonsList.removeFieldWithName(personMap, "Orest");

		CreatePersonsList.showPersonsNames(personMap);

		Student.fillOutStudentList(br_1, studentMap);
		
		Student.printStudents(studentMap);
		
		Student.printStudentsByName(studentMap);

		Student.printStudentsByCourse(studentMap);
		
		System.out.println(Student.compareStudents(studentMap.get(0), studentMap.get(1)));

	}
}