package AllHomeWorks.HomeWork2;

import java.io.IOException;
import java.util.ArrayList;

public class HomeWork2 {
    public static void doTask() throws IOException {
        ArrayList<Person> personList = new ArrayList<>();

        for (int i=0; i<5; i++) {
        System.out.println("---------------------------------------------");
        System.out.println("Person #" + (i+1));
        Person pers = new Person();
        pers.setNumber(i+1);
        pers.input();
        personList.add(pers);
    }
        for (Person person: personList) {
            person.output();
        }
    }
}
