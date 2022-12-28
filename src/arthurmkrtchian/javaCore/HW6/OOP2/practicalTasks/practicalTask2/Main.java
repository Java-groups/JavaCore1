package arthurmkrtchian.javaCore.HW6.OOP2.practicalTasks.practicalTask2;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Student(),
                new Teacher(),
                new Cleaner()
        };

        for (int i = 0; i < persons.length; i++) {
            persons[i].print();
        }
    }
}
