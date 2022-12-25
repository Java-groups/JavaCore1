package HM6.PracticalTask2;

public class Main {
    public static void main(String[] args) {

        Person[] persons = {new Student("Ihor"), new Teacher("Vasyl"), new Cleaner("Bohdan"), new Student("Ira")};

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].print());
            if (persons[i] instanceof Staff) {
                System.out.println(((Staff) persons[i]).salary());
            }
        }
    }
}
