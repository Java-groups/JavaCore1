package HM5.PracticalTask2;

public class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "x: " + x + "; y: " + y;
    }
    void print () {
        System.out.println("This is the point");
    }
}
