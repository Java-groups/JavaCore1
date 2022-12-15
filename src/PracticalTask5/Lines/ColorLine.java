package PracticalTask5.Lines;

public class ColorLine extends Line {

    private String color;


    public ColorLine(Point point, Point point1, String color) {
        super(point, point1);
        this.color = color;
    }

    @Override
    public String toString() {
        return "LineColor [ " +
                "point = " + getPoint() +
                ", point1 = " + getPoint1() +
                ", color = " + color +
                " ]";
    }

    public void print() {
        System.out.println("LineColor [ " +
                super.toString() +
                ", color = " + color +
                " ]");

    }

}
