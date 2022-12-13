package AllHomeWorks.HomeWork5Practical.Task1;

public class ColorLine extends Line {
    protected String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" + super.toString() +
                " color='" + color + '\'' +
                '}';
    }
}
