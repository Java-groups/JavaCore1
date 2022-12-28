package arthurmkrtchian.javaCore.HW5.OOP1.practicalTasks.practicalTask2;

public class ColorLine extends Line{
        private Color color;

    public ColorLine() {

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ColorLine(Point startPoint, Point finishPoint, Color color) {
        super(startPoint, finishPoint);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Line {" +
                "startPoint: " + getStartPoint().toString() +
                ", finishPoint: " + getFinishPoint().toString() +
                ", color: " + color +
                "}";
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}

