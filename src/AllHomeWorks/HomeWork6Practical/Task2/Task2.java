package AllHomeWorks.HomeWork6Practical.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void doTask(BufferedReader br) throws IOException {
        ArrayList<Person> personsList = new ArrayList<>(
                Arrays.asList(
                        new Student("Lisa"),
                        new Teacher("Maria"),
                        new Cleaner("Oleg"),
                        new Teacher("Alexa")
                )
        );

        for (Person person: personsList){
            person.print();
        }
    }



}
