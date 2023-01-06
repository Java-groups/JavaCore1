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
        FullName fn = readFullName();

        fn.printSurnamesAndInitials();
        fn.printName();
        fn.printFirsMiddleLastNames();

        System.out.println("\nIn any case, our operator will contact you to check that the name you entered is correct. Bye.");
    }

    private static FullName readFullName(){
        FullName fullName;
        while(true){
            System.out.println("\nPlease, enter any name in following format: LastName FirstName MiddleName");
            try {
                fullName = new FullName(br.readLine());
                break;
            }catch (IllegalArgumentException | IOException e){
                System.out.println("Incorrect input, try again\n");
            }
        }
        return fullName;
    }

}
