package AllHomeWorks.HomeWork5Practical.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void doTask(BufferedReader br) throws IOException {
        ArrayList<Line> linesList = new ArrayList<>(
                Arrays.asList(
                        new Line(new Point(1,1), new Point(2,2)),
                        new Line(new Point(3,3), new Point(4,4)),
                        new ColorLine(new Point(5,5), new Point(6,6), "black"),
                        new ColorLine(new Point(10,10), new Point(12,12), "Green")
                )
        );

        for (Line line: linesList){
            line.print();
        }
    }
}
