package PracticalTask11_Exception.Rectangle;

public class AreaRectangle {
    private int a;
    private int b;
    public AreaRectangle() {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "AreaRectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int squareRectangle (int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        return a*b;
    }
}
