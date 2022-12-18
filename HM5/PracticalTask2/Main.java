package HM5.PracticalTask2;

public class Main {
    public static void main(String[] args) {
        Line[] lines = {new Line(), new ColorLine(), new Line()};

        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i].print());
        }
    }
}
