package HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework1Task2 {

    /*  Define String variables name and address. Output question "What is your name?"
     * Read the value name and output next question: “Where are you live, (name)?".
     *  Read address and write whole information.    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println ("Where are you live "+ name);
        String adress = br.readLine();
        System.out.println("Your name is "+ name +" and you live in "+ adress);

    }
}
