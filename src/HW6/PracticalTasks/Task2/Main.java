package HW6.PracticalTasks.Task2;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Student();
        persons[1] = new Cleaner();
        persons[2] = new Teacher();

       for (int i = 0; i < persons.length; i++){
           System.out.println(persons[i].print());
           if (persons[i] instanceof Staff) {
               System.out.println("My salary is: " + ((Staff) persons[i]).salary());
           }
           // Thanks; Got it :)
//           if (persons[i].typeOfPerson().equalsIgnoreCase("Cleaner")) {
//               System.out.println(" and my salary is " + ((Cleaner)persons[i]).salary());
//           } if (persons[i].typeOfPerson().equalsIgnoreCase("Teacher")) {
//               System.out.println(" and my salary is " + ((Teacher)persons[i]).salary());
//           } if (persons[i].typeOfPerson().equalsIgnoreCase("Student")) {
//               System.out.println();
           }

       }
//        System.out.println("Salary of the teacher is " + ((Teacher)persons[2]).salary());
//        System.out.println("Salary of the cleaner is " + ((Cleaner)persons[1]).salary());



    }

