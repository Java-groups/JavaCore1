package AllHomeWorks.HomeWork10Practical.Task2v2;

import java.io.BufferedReader;
import java.io.IOException;

public class Task2v2 {
    public static void doTask(BufferedReader br) throws IOException {
        System.out.println();
        System.out.println("Please input Surname, Name and Patronymic, or 0 - for exit:");
        String fullName = br.readLine();

        String space = " ";
        String name;
        String surname;
        String patronymic;

        char firstLetterName;
        char firstLetterPatronymic;

        String[] words = fullName.split(space);
        if (words.length != 3){
            System.out.println("\n Waiting for your Full Name: Surname, Name, Patronymic");
        } else {
                name = words[0];
                surname = words[1];
                patronymic = words[2];
                firstLetterName = name.charAt(0);
                firstLetterPatronymic = patronymic.charAt(0);

            System.out.printf("%s %s.%s.", surname, firstLetterName, firstLetterPatronymic);
            System.out.printf("\n %s", name);
            System.out.printf("\n %s %s %s ", name, patronymic, surname);

        }
    }
}
