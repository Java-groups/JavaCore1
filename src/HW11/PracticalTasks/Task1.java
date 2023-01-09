package HW11.PracticalTasks;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    static int squareRectangle(int a, int b) throws MyException {
        if (a <= 0 || b <= 0) {
            throw new MyException("Non valid sides");
        }
        return a * b;
    }

    static class MyException extends Exception {
        public MyException(String msg) {
            super(msg);
        }
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter sides of the rectangle:");
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            System.out.println("Area of the rectangle with your sides: " + squareRectangle(a, b));
        } catch (IOException | NumberFormatException | MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
