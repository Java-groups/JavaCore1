package HW7.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		List<Student> students = new ArrayList<>();
		students.add(new Student(new FullName("Oleh", "Vyshnevskyj"), 21, 4));
		students.add(new Student(new FullName("Vasyl", "Glyva"), 19, 2));
		students.add(new Student(new FullName("Kateryna", "Vitvitska"), 21, 4));

		System.out.println("============ BEFORE COPY ============");
		iterate(students);
		
		Student copyOfStudent = (Student) students.get(0).clone();
		copyOfStudent.setCourse(1);
		students.add(copyOfStudent);
		
        System.out.println("============ AFTER  COPY ============");
		iterate(students);

	}

	public static void iterate(List<Student> list) {
        for (int i = 0; i < list.size(); i++) {
        	System.out.println(list.get(i).info() + "\n" + list.get(i).activity() + "\n");
        }
	}

}
