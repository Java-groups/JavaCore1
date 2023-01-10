package edu.homeworks.hw11.HomeWork.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Div div = new Div();
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a = ");
        a = scanner.nextInt();
        System.out.println("Enter b = ");
        b = scanner.nextInt();
        try {
            System.out.println(div.div(a,b));
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
 }
