import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FlowerBed roundFlowerBed = new FlowerBed();
        System.out.println("Please enter a radius");
        roundFlowerBed.setPerimeter(Integer.parseInt(br.readLine()));
        System.out.println("Perimeter: "+roundFlowerBed.getPerimeter());
        System.out.println("Area: "+roundFlowerBed.getArea());
    }
}