package com.home_work_9_Collections_2_HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Student
{
	private String student_name;
	private int course_number;
	private static int count;

	public Student(String student_name)
	{
		this.student_name = student_name;
		count++;
	}
	public String getStudent_name()
	{
		return student_name;
	}
	public void setStudent_name(String student_name)
	{
		this.student_name = student_name;
	}
	public int getCourse_number()
	{
		return course_number;
	}
	public void setCourse_number(int course_number)
	{
		this.course_number = course_number;
	}

	protected static void fillOutStudentList(BufferedReader br, TreeMap<Integer, Student> new_student_list) throws IOException
	{
		boolean exit=false;
		String  in_student_name;
		String str;

	out: do
		{
			System.out.println("Please, to fill out the students list and add new student in it, enter Name and then course number, or word `exit` to quit without changes.");
			System.out.println("Please, enter student Name.");
			in_student_name = ( str = br.readLine() ).isEmpty() ? "empty" : str ;
			while(in_student_name.equals("empty")) 
			{
				System.out.println("Field is empty, please enter student Name, or word `exit` to quit.");
				continue out;
			}
			if( "exit".equals( in_student_name ))
			{
				exit = true;
			}
			else
			{									
				new_student_list.put(count, new Student(in_student_name));
				System.out.println("Please, enter student course.");
				new_student_list.get(count-1).setCourse_number( checkInFormatIntegerOrExit(br) );
				exit = false;
			}
		}while(!exit);
	}

	protected static int checkInFormatIntegerOrExit(BufferedReader in) throws IOException
	{
		String in_word;

		do 
		{
			System.out.println("Please, enter value greter than zero, or q for exit.");
			try 
			{
				if ("q".equals(in_word=in.readLine())) 
				{
					return -1;
				}
				else if(Integer.parseUnsignedInt(in_word)>0)
				{
					return Integer.parseUnsignedInt(in_word);
				}
				else 
				{
					Integer.parseUnsignedInt("-1");
				}
			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter value greater than zero, or for exit enter: q.");
			}
		}while(true); 
	}

	protected static void printStudents(Map<Integer, Student> student_list) 
	{

		for (Iterator<Student> iterator = student_list.values().iterator(); iterator.hasNext();)
		{
			Student student = (Student) iterator.next();
			System.out.println("Student name: " + student.getStudent_name() + ";\tStudent course number: " + student.getCourse_number());
		}
	}

	protected static void printStudentsByName(Map<Integer, Student> student_list) 
	{
		List<Student> list = student_list.values().stream().collect(Collectors.toList());
		Collections.sort(list, (std1, std2) -> std1.getStudent_name().compareTo(std2.getStudent_name()) );
		AtomicInteger i = new AtomicInteger(0); 
		student_list = list.stream().collect(Collectors.toMap(n -> i.incrementAndGet(), std -> std));

		for (Iterator<Student> iterator = student_list.values().iterator(); iterator.hasNext();)
		{
			Student student = (Student) iterator.next();
			System.out.println("Student name: " + student.getStudent_name() + ";\tStudent course number: " + student.getCourse_number());
		}
	}

	protected static void printStudentsByCourse(Map<Integer, Student> student_list) 
	{
		List<Student> list = student_list.values().stream().collect(Collectors.toList());
		Collections.sort(list, (std1, std2) -> std1.getCourse_number() - std2.getCourse_number() );
		AtomicInteger i = new AtomicInteger(0); 
		student_list = list.stream().collect(Collectors.toMap(n -> i.incrementAndGet(), std -> std));

		for (Iterator<Student> iterator = student_list.values().iterator(); iterator.hasNext();)
		{
			Student student = (Student) iterator.next();
			System.out.println("Student name: " + student.getStudent_name() + ";\tStudent course number: " + student.getCourse_number());
		}
	}

	protected static boolean compareStudents(Student std1, Student std2) 
	{
		return (std1.getStudent_name().toString()).equals(std2.getStudent_name().toString()) & std1.getCourse_number()==std2.getCourse_number(); 
	}
}