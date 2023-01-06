package AllHomeWorks.HomeWork7Practical;

import java.io.BufferedReader;
import java.io.IOException;

public class HomeWork7Practical {
    public static void doTask(BufferedReader br) throws IOException {
        Department department = new Department("IT Department", new Department.Adress("Lviv", "Local", 65));
        department.info();

        try {
            Department copyOfDepartment = (Department) department.clone();
            copyOfDepartment.adress.setCity("Kharkiv");
            copyOfDepartment.info();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
