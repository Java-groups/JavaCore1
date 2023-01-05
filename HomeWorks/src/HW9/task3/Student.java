package HW9.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private Integer course;

	public Student() {
	};

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public static void main(String[] args) {
		// TODO declare List students and add to the list five different students
		// display the list of students ordered by name
		// display the list of students ordered by course.
		Student student = new Student();
		List<Student> students = new ArrayList<>();
		students.add(new Student("Nazar", 4));
		students.add(new Student("Andrij", 3));
		students.add(new Student("Roman", 2));
		students.add(new Student("Arthur", 3));
		students.add(new Student("Yaryna", 2));
		student.printStudent(students, 3);

		System.out.println("\nBefore sorting: " + students);

		student.compareByName(students);
		System.out.println("\nList of students ordered by name: " + students);

		student.compareByCourse(students);
		System.out.println("\nList of students ordered by course: " + students);

	}

	public void printStudent(List<Student> students, Integer course) {
		// TODO Write a method, which receives a list of students and the course number
		// and prints to the console the names of the students from the list,
		// which are taught in this course (use an iterator)

		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student element = iterator.next();
			if (element.course == course) {
				System.out.println(element);
			}
		}

	}

	public void compareByName(List<Student> student) {
		Collections.sort(student, new SortByName());
	}

	public void compareByCourse(List<Student> student) {
		Collections.sort(student, new SortByCourse());
	}

	@Override
	public String toString() {
		return "\nName: " + name + ", course: " + course;
	}

	private class SortByName implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

	private class SortByCourse implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return Integer.compare(o1.getCourse(), o2.getCourse());
		}
	}

}
