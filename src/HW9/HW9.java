package HW9;

import HW9.model.SortByCourse;
import HW9.model.SortByName;
import HW9.model.Student;

import java.util.*;

public class HW9 {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(9);
        set1.add(23);
        set1.add(21);
        set1.add(8);
        Set<Integer> set2 = new TreeSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(56);
        set2.add(21);
        set2.add(23);
        Set<Integer> union = new TreeSet<>(set1);
        union.addAll(set2);
        System.out.println("First task");
        System.out.println("Об'єднання " + union);
        Set<Integer> intersect = new TreeSet<>(set1);
        intersect.retainAll(set2);
        System.out.println(" Переріз " + intersect);
        System.out.println("Second task");
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Polina", "Chebukina");
        personMap.put("Nicolay", "Chebukin");
        personMap.put("Tatyana", "Chebukina");
        personMap.put("Kate", "Maximova");
        personMap.put("Julia", "Semashkova");
        personMap.put("Igor", "Semashkov");
        personMap.put("Olexandr", "Semashkov");
        personMap.put("Lubov", "Troyan");
        personMap.put("Volodymyr", "Troyan");
        personMap.put("Anna", "Krasnoshchekova");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

        Set<String> firstNames = new HashSet<String>();

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            firstNames.add(entry.getValue());
        }

        int countKeys = 0;
        for (String firstName : firstNames) {
            countKeys = 0;
            for (Map.Entry<String, String> entry : personMap.entrySet()) {
                if (entry.getValue().equals(firstName)) {
                    countKeys++;
                }
            }

            if (countKeys > 0) {
                System.out.println(firstName + " has been founded " + countKeys);
            }


        }
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getKey().equals("Polina")) {
                iterator.remove();
            }
        }
        System.out.println(personMap);
        System.out.println("************************");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Polina", 345));
        students.add(new Student("Anna", 678));
        students.add(new Student("Dima", 4859));
        students.add(new Student("Nick", 7689));
        students.add(new Student("Andrey", 35467));

        Student student = new Student("Test", 33);
        student.printStudents(students, 345);


        students.sort(new SortByCourse());
        System.out.println("\n Sort by Course: ");
        for (Student st : students) {
            System.out.println(st.toString());
        }


        students.sort(new SortByName());

        System.out.println("\n Sort by Name: ");
        for (Student st : students) {
            System.out.println(st.toString());
        }

    }
}
