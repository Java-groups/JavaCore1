package HM5.PracticalTask2;

public class Line {
    Point point1 = new Point(30, 50);
    Point point2 = new Point(10, 40);

    @Override
    public String toString() {
        return "x: " + point1.x + "; y: " + point1.y + "; x: " + point2.x + "; y: " + point2.y;
    }

    public String print () {
        return "This is the line";
    }
}
