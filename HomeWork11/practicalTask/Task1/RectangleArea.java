package edu.homeworks.hw11.practicalTask.Task1;

public class RectangleArea {
    int squareRectangle (int a, int b) throws MyException{
        if(a<0 || b<0){
            throw new MyException("Number less 0");
        }
        else return a*b;
    }
}

class MyException extends Exception{
    public MyException(String m){
        super(m);
    }
    public MyException(){

    }
}
