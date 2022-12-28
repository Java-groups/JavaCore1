package arthurmkrtchian.javaCore.HW3.conditionStatements.practicalTasks.practicalTask1;

import helper.Reader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Reader reader = new Reader();
        int value;

        System.out.println("Hi, let`s enter some integers and find out how many of them is odd!");
        int oddcounter = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Please, enter an integer: ");
            value = reader.readInteger("Entered number must be an integer.");
            if ((value % 2) == 0){
                oddcounter++;
            }
        }

        if (oddcounter > 1) {
            System.out.printf("You are entered 3 numbers. And %s of them are odd", oddcounter);
        } else {
            System.out.printf("You are entered 3 numbers. And %s of them is odd", oddcounter);
        }
    }
}
