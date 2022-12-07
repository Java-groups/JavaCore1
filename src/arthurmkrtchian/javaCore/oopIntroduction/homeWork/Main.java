package arthurmkrtchian.javaCore.oopIntroduction.homeWork;


//        Create Console Application and add class Person to the project.
//          Class Person should consist of
//              - three private fields: firstName, lastName and birthYear (the birthday year)
//              - properties for access to these fields
//              - default constructor and constructor with 2 parameters (first and last names)
//              - methods:
//                  • getAge() - to calculate the age of person
//                  • input() - to input information about person
//                  • output() - to output information about person
//                  • changeName(String fn, String ln) - to change the first name or/and last name
//          In the method main() create 5 objects of Person type and input information about them.


public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[5];

        for (int i = 0; i < 5; i++) {
            persons[i] = new Person();
            persons[i].input();
        }

        for (int i = 0; i < 5; i++) {
            persons[i].output();
        }


//        for (int i = 0; i < 5; i++) {
//            persons[i] = new Person("FirstName-"+(i+1), "LastName-"+(i+1));
//            persons[i].setBirthYear(1999+i);
//            persons[i].output();
//        }

    }
}
