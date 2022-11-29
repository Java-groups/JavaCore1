import java.util.Scanner;

public class FlowerBed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        double area = radius * radius * Math.PI;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
