package AllHomeWorks.HomeWork2;

import java.io.IOException;
import java.util.ArrayList;

public class HomeWork2 {
    public static void doTask() throws IOException {
    for (int i=0; i<5; i++) {
        System.out.println("---------------------------------------------");
        System.out.println("Person #" + i);
        Person pers = new Person();
        pers.input();
        pers.output();
    }
    }
}
