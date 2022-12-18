package HW5.com.model.color;

public class ColorLine extends Line{
    private  Color red;
    private  Color black;

    public ColorLine(Point point1, Point point2, Color red, Color black) {
        super(point1, point2);
        this.red = red;
        this.black = black;
    }

    public Color getRed() {
        return red;
    }

    public Color getBlack() {
        return black;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "red=" + red +
                ", black=" + black +
                '}';
    }
    @Override
    public void print(){
        System.out.println("Print from ColorLine");
    }

}
