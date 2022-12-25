
package edu.homeworks.hw5.practicalTask;

public class Line {
    private Point firstPoint,secondPoint;
    private int x,y;

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }
    Line(Point firstPoint, Point secondPoint){
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;

    }


    public int result(){
        x = firstPoint.getX();
        y = secondPoint.getY();
        return x+y;
    }

    @Override
    public String toString(){
        return "X = " + firstPoint + "\n Y = " + secondPoint + "\n result = " + result();
    }

    public void print(){
        System.out.println(toString());
    }
}
