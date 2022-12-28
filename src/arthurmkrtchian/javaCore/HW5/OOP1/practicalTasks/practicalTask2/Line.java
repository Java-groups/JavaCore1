package arthurmkrtchian.javaCore.HW5.OOP1.practicalTasks.practicalTask2;

public class Line {
    private Point startPoint;
    private Point finishPoint;

    public Line() {
    }

    public Line(Point startPoint, Point finishPoint) {
        this.startPoint = startPoint;
        this.finishPoint = finishPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getFinishPoint() {
        return finishPoint;
    }

    public void setFinishPoint(Point finishPoint) {
        this.finishPoint = finishPoint;
    }

    @Override
    public String toString() {
        return "Line {" +
                "startPoint: " + startPoint.toString() +
                ", finishPoint: " + finishPoint.toString() +
                "}";
    }

    public void print(){
        System.out.println(toString());
    }

}
