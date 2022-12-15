package PracticalTasks.Task2;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Student();
        persons[1] = new Cleaner();
        persons[2] = new Teacher();

       for (int i = 0; i < persons.length; i++){
           System.out.print(persons[i].print());
           if (persons[i].typeOfPerson().equalsIgnoreCase("Cleaner")) {
               System.out.println(" and my salary is " + ((Cleaner)persons[i]).salary());
           } if (persons[i].typeOfPerson().equalsIgnoreCase("Teacher")) {
               System.out.println(" and my salary is " + ((Teacher)persons[i]).salary());
           } if (persons[i].typeOfPerson().equalsIgnoreCase("Student")) {
               System.out.println();
           }

       }
//        System.out.println("Salary of the teacher is " + ((Teacher)persons[2]).salary());
//        System.out.println("Salary of the cleaner is " + ((Cleaner)persons[1]).salary());



    }
}
