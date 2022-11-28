public class FlowerBed {
    private double flowerBedRadius;
    private static final double PI = 3.14;
    public void setPerimeter(double flowerBedRadius) {
        this.flowerBedRadius = flowerBedRadius;
    }
    public double getPerimeter() {
        return 2 * PI * flowerBedRadius;
    }
    public double getArea() {
        return PI * flowerBedRadius * flowerBedRadius;
    }
}