package Lesson6.practical2;

public class App {
    public static void main(String[] args) {
        Line[] lines = new Line[2];
        lines[0] = new Line(new Point(2, 10), new Point(5, 18));
        lines[1] = new ColorLine(new Point(4, 6), new Point(8, 9), "red");

        for (Line el : lines) {
            el.print();
        }
    }
}
