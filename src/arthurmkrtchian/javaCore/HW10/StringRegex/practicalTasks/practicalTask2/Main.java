package arthurmkrtchian.javaCore.HW10.StringRegex.practicalTasks.practicalTask2;


//        Enter surname, name and patronymic on the console as a variable of type String. Output on the
//        console:
//           • surnames and initials
//           • name
//           • name, middle name and last name

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IllegalArgumentException {

        //FullName fn = new FullName("Mkrtchian arthur         Vartanovych");
        //FullName fn = new FullName("Mkrtchian Arthur Vartanovy4");
        //FullName fn = new FullName("Mkrtian Arthur Vartanovych Dnipro");
        Person fn = readName();

        fn.printSurnameAndInitials();
        fn.printName();
        fn.printFirsMiddleLastNames();

        System.out.println("\nIn any case, our operator will contact you to check is the name you`ve entered correct. Bye.");
    }

    private static Person readName(){
        Person person;
        while(true){
            System.out.println("\nPlease, enter any name in following format: last name first name and patronymic");
            try {
                person = new Person(br.readLine());
                break;
            }catch (IllegalArgumentException | IOException e){
                System.out.println("Incorrect input, try again\n");
            }
        }
        return person;
    }

}
