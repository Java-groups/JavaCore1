package Lesson6.practical2;

public class Line {
    protected Point p1;
    protected Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    @Override
    public String toString() {
        return "Line{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    public void print(){
        System.out.println("Line with the coordinates: " + p1 + "," + p2);
    }
}
