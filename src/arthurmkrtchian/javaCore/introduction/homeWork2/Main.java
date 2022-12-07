package arthurmkrtchian.javaCore.introduction.homeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//         Define String variables name and address. Output question "What is your name?" Read the
//         value name and output next question: “Where are you live, (name)?". Read address and
//         write whole information

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        String address;

        System.out.println("What is your name?");
        name = br.readLine();
        System.out.printf("Where are you live, %s?\n", name);
        address = br.readLine();

        System.out.printf("Aw, let me guess. Your name is %s and you live at %s", name, address);
    }
}
