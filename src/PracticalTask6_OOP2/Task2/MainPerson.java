package PracticalTask6_OOP2.Task2;

public class MainPerson {
    public static void main(String[] args) {

        Person[] persons = new Person[3];

        persons[0] = new Student("Sasa");
        persons[1] = new Teachers("Svetlana Ivanovna");
        persons[2] = new Cleaners("Kat");

        for (Person person : persons) {
            person.print();

            if (person instanceof Teachers || person instanceof Cleaners) {
                double sal = ((Staff) person).salary();
                System.out.println("Salary " + person.getName() + " = " + sal + " $");
            }
            System.out.println();

        }
    }
}
