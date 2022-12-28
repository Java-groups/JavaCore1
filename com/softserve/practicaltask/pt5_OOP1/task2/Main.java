package com.softserve.practicaltask.pt5_OOP1.task2;

public class Main {

    public static void main(String[] args) {
        Line[] lines = new Line[2];
        lines[0] = new Line(new Point(1,2), new Point(1,2));
        lines[1] = new ColorLine(new Point(2,3), new Point(2,3), "Green");
        for (int i = 0; i < lines.length; i++) {
            lines[i].print();
        }
    }
}
