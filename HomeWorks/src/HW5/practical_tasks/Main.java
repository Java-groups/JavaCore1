package HW5.practical_tasks;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Line> lines = new ArrayList<>();

		lines.add(new Line(new Point(3, 4), new Point(1, 5)));
		lines.add(new Line(new Point(1, 2), new Point(4, 6)));
		lines.add(new Line(new Point(2, 7), new Point(2, 1)));
		lines.add(new ColorLine(new Point(2, 5), new Point(3, 2), "Red"));
		lines.add(new ColorLine(new Point(3, 1), new Point(1, 7), "Green"));
		lines.add(new ColorLine(new Point(1, 1), new Point(3, 7), "Blue"));
    
		lines.forEach(line -> System.out.println(line.print()));
	}

}
