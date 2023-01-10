package edu.homeworks.hw11.HomeWork.Task2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException, IOException {
        Scanner scanner = new Scanner(System.in);
        ReadNumber readNumber = new ReadNumber();
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        try {
            for(int i=0;i<10;i++){
                System.out.println("Write number");
                try {
                    arrayList.add(readNumber.readNumber(1,100,scanner));
                    System.out.println("Your write number = " + arrayList.get(i));
                } catch (NumberFormatException | IOException e){
                    System.err.println("Your write unable element = " +e.getMessage());
                } catch (Exception e){
                    throw new MyException(e.getMessage());
                }
            }
        }
        finally {
            scanner.close();
        }
    }
 }
