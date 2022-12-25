package edu.homeworks.hw5.practicalTask;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1,5);
        Point point2 = new Point(2,4);
        Point point3 = new Point(5,2);

        Line[] lines = new Line[]{
                new Line(point1,point1),
                new ColorLine(point1,point1,"Black"),
        };

        for (int i=0;i<lines.length;i++){
            lines[i].print();
        }

    }
}