package AllHomeWorks.HomeWork10Practical.Task2;

import java.io.BufferedReader;
import java.io.IOException;

public class Task2 {
    public static void doTask(BufferedReader br) throws IOException {

        System.out.println();
        System.out.println("Please input Surname, Name and Patronymic, or 0 - for exit:");
        String fullName = br.readLine();
        String space = " ";
        String name;
        String surname;
        String withoutSurname;
        String patronymic;
        char firstLetterName;
        char firstLetterPatronymic;
        int positionSpace1;
        int positionSpace2;

        if (!fullName.contains(space)){
            System.out.println("Waiting for your Full Name: Surname, Name, Patronymic");
        } else {
            positionSpace1 = fullName.indexOf(space);
            surname = fullName.substring(0, positionSpace1);
            withoutSurname = fullName.substring(positionSpace1 + 1);
            firstLetterName = fullName.charAt(positionSpace1 +1);
            positionSpace2 = withoutSurname.indexOf(space);
            name = withoutSurname.substring(0, positionSpace2 + 1);
            firstLetterPatronymic = withoutSurname.charAt(positionSpace2 + 1);
            patronymic = withoutSurname.substring(positionSpace2 + 1);

            System.out.printf("%s %s.%s.", surname, firstLetterName, firstLetterPatronymic);
            System.out.printf("\n Name is %s", name);
            System.out.printf("\n Name is %s, Middle name is %s, Last name is %s ", name, patronymic, surname);
        }

    }
}
