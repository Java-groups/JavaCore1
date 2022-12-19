package Lesson6.practical2;

import java.awt.*;

public class ColorLine extends Line {
    private String color;

    public ColorLine(Point p1, Point p2, String color) {
        super(p1, p2);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    public void print() {
        System.out.println(color + " line with the coordinates: " + p1 + "," + p2);
    }
}
