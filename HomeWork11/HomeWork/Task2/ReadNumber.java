package edu.homeworks.hw11.HomeWork.Task2;

import java.io.IOException;
import java.util.Scanner;

public class ReadNumber {
    public int readNumber(int start, int end, Scanner scanner) throws MyException,IOException {
        try {
            int number = scanner.nextInt();
                    if(start<= number && number<=end){
                        return number;
                    } else if (start>number){
                        throw new MyException("Number less " + start);

                    }else if (end<number){
                        throw new MyException("Number more " + end);
                    }
        } catch (NumberFormatException e){
            System.err.println("Number is invalid");
        }
        return 0;
    }
}
class MyException extends Exception{
    public MyException(String m){
        super(m);
    }
}
