package edu.homeworks.hw11.practicalTask.Task1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, MyException {
        RectangleArea rectangleArea = new RectangleArea();
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a = ");
        a = scanner.nextInt();
        System.out.println("Enter b = ");
        b = scanner.nextInt();
        try {
            System.out.println(rectangleArea.squareRectangle(a,b));
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
        }



    }
 }
