package PracticalTask5.Lines;

// Create three classes:
//- Point with attributes x and y
//- Line which contains two object of Point class
//- ColorLine with attributes Color which extends Line class.
//Override method toString() and define method print() in every classes
//In main() method create array of Line and add some Line and ColorLine to it.
//Call method print() for all of it.

public class MainLines {
    public static void main(String[] args) {
        Line[] line = new Line[4];
        line[0] = new Line(new Point(2,5), new Point(3,8));
        line[1] = new Line(new Point(3,9), new Point(1,4));
        line[2] = new ColorLine(new Point(4,6), new Point(7,8), "blue");
        line[3] = new ColorLine(new Point(5,7), new Point(6,4), "red");
        for (Line i : line) {
            i.print();
        }

    }
}
