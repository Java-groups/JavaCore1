package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args)  throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("write radius");
    int radius = Integer.parseInt(br.readLine());
    double Pi = 3.1415;
    double perimeter = 2*Pi*radius;
    double square = Pi*radius*radius;
    System.out.println("perimeter = " + perimeter);
    System.out.println("square = " + square);


}
}
