package PracticalTask5.Lines;

public class Line {

    private Point point;
    private Point point1;

    public Line(Point point, Point point1) {
        this.point = point;
        this.point1 = point1;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    @Override
    public String toString() {
        return "Line [ " +
                "point = " + point +
                ", point1 = " + point1 +
                " ]";
    }

    public void print() {
        System.out.println("Line [ " +
                "point = " + point +
                ", point1 = " + point1 +
                " ]");
    }
}
