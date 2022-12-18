package HM5.PracticalTask2;

public class ColorLine extends Line {
    @Override
    public String toString() {
        return point1.toString() + point2.toString();
    }
    public String print() {
        return "This is the color line";
    }
}
