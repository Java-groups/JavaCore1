package HW11;

import HW11.model.*;

import java.util.Scanner;

public class PracticalTask {
    public static int square(int a, int b) {
        try {
            if (a <= 0 | b <= 0) {
                throw new Exception("Negative value");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return a * b;
    }





    public static void main(String[] args) {
        System.out.println("Start of first practical task");
        System.out.println("Enter first number for count square");
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter second number for count square");
        int num2 = sc.nextInt();
        System.out.println("Square is " + square(num1, num2));
        System.out.println("Start of second practical task");
        Plant[] plant = new Plant[5];
        try{
            plant[0] = new Plant("rose","black",25);
            System.out.println(plant[0]);
        }catch (ColorException | TypeException e){
            System.err.println(e.getMessage() +"\n");
        }
        try{
            plant[1] = new Plant("rose","yellow",29);
            System.out.println(plant[1]);
        }catch (ColorException | TypeException e){
            System.err.println(e.getMessage() +"\n");
        }
        try{
            plant[2] = new Plant("peony","blue",47);
            System.out.println(plant[2]);
        }catch (ColorException | TypeException e){
            System.err.println(e.getMessage() +"\n");
        }
        try{
            plant[3] = new Plant("tulip","yellow",14);
            System.out.println(plant[3]);
        }catch (ColorException | TypeException e){
            System.err.println(e.getMessage() +"\n");
           e.printStackTrace();
        }
        try{
            plant[4] = new Plant("rose","blue",25);
            System.out.println(plant[4]);
        }catch (ColorException | TypeException e){
            System.err.println(e.getMessage() +"\n");
        }



    }
}
