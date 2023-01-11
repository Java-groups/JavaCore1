package com.edu.practicaltask11;

/*   1. Create a method for calculating the area of a rectangle
        int squareRectangle (int a, int b),
        which should throw an exception if the user enters negative value. Input values a and b
        from console. Check the squareRectangle method in the method main. Check to input
        nonnumeric value.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String arg[]) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter sides a and b of the rectangle:");
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            System.out.println("Square of the rectangle is: " + squareRectangle(a, b));
        } catch (IOException | NumberFormatException | MyException e) {
            System.err.println(e.getMessage());
        }
    }

    //Creating my own exception: myException, to describe type of the exception.
    static class MyException extends Exception {
        public MyException(String msg) {
            super(msg);

        }
    }

    //Throws myException to "main".
    static int squareRectangle(int a, int b) throws MyException {
        //Use an "if" block instead of catching negative values by throwing exceptions.
        if (a < 0 | b < 0)
            throw new MyException("\na or b variables are negative," +
                    "\nPlease input positive values.");
        return a * b;
    }
}


