package edu.homeworks.hw5.practicalTask;

public class Point {
    private int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    Point(int x,int y){
        this.x = x;
        this.y = y;

    };
    @Override
    public String toString(){
        return "X = " + x + "\n Y = " + y;
    }
    public void print(){
        System.out.println(toString());
    }
}
