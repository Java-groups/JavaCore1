package arthurmkrtchian.javaCore.HW11.exceptions.practicalTasks.practicalTask1;


//        1. Create a method for calculating the area of a rectangle
//        int squareRectangle (int a, int b),
//        which should throw an exception if the user enters negative value. Input values a and b
//        from console. Check the squareRectangle method in the method main. Check to input
//        nonnumeric value.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print("Please enter rectangle height: ");
        int a = read();
        System.out.print("Please enter rectangle width: ");
        int b = read();
        System.out.printf("Rectangle area is = %d\n", squareRectangle(a,b));
    }

    static int read()  {
        int result;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (true) {
            try {
                line = reader.readLine();
                result = Integer.parseInt(line);
                break;
            } catch (NumberFormatException | IOException e) {
                System.out.println("You should enter an integer.");
                System.out.print("Try again: ");
            }
        }
        return result;
    }

    static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0){
            throw new IllegalArgumentException("Rectangle side length can`t be negative");
        }
        return a*b;
    }
}
