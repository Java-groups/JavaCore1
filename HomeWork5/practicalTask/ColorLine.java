package edu.homeworks.hw5.practicalTask;

public class ColorLine extends Line {
    private String colorLine;

    ColorLine(Point firstPoint, Point secondPoint, String colorLine) {
        super(firstPoint, secondPoint);
        this.colorLine = colorLine;

    }


    public String getColorLine() {
        return colorLine;
    }

    public void setColorLine(String colorLine) {
        this.colorLine = colorLine;
    }
    @Override
    public String toString(){
        return "X = " + getFirstPoint() +
                "\n Y= " + getSecondPoint() +
                "\n ColorLine " + getColorLine();
    }
    @Override
    public void print(){
        System.out.println(toString());
    }
}
