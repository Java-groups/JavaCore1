package arthurmkrtchian.javaCore.HW5.OOP1.practicalTasks.practicalTask2;

//        Create three classes:
//        - Point with attributes x and y
//        - Line which contains two object of Point class
//        - ColorLine with attributes Color which extends Line class.
//        Override method toString() and define method print() in every classes

//        In main() method create array of Line and add some Line and ColorLine to it.
//        Call method print() for all of it.


public class Main {
    public static void main(String[] args) {
        Point pointS1 = new Point(4,2);
        Point pointS2 = new Point(7,3);
        Point pointS3 = new Point(2,1);
        Point pointS4 = new Point(5,4);
        Point pointF1 = new Point(7,7);
        Point pointF2 = new Point(9,5);
        Point pointF3 = new Point(5,8);
        Point pointF4 = new Point(9,6);


        Line[] lines = {
                new Line(pointS1,pointF1),
                new ColorLine(pointS2, pointF2, Color.AQUA),
                new Line(pointS3, pointF3),
                new ColorLine(pointS4, pointF4, Color.GREEN)
        };

        for (int i = 0; i < lines.length; i++) {
            lines[i].print();
        }
    }
}
