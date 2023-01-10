package edu.homeworks.hw11.HomeWork.Task1;

import java.io.IOException;

public class Div {
    public double div(double a,double b) throws MyException {
        try {
            return a*b;
        }
        catch (ArithmeticException e){
            throw new MyException("Invalid element");
        }
    }
}
class MyException extends Exception{
    public MyException(String m){
        super(m);
    }
}