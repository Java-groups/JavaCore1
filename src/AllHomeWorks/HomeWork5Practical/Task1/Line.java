package AllHomeWorks.HomeWork5Practical.Task1;

public class Line {
    protected Point start;
    protected Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    void print() {
        System.out.println(this);
    }
}
