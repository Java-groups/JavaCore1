import java.util.Scanner;

public class PhoneCall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit c1: ");
        double c1 = sc.nextDouble();
        System.out.print("Enter time for c1: ");
        double t1 = sc.nextDouble();
        System.out.println("Result: " + c1*t1);

        System.out.print("Enter unit c2: ");
        double c2 = sc.nextDouble();
        System.out.print("Enter time for c2: ");
        double t2 = sc.nextDouble();
        System.out.println("Result: " + c2*t2);

        System.out.print("Enter unit c3: ");
        double c3 = sc.nextDouble();
        System.out.print("Enter time for c3: ");
        double t3 = sc.nextDouble();
        System.out.println("Result: " + c3*t3); Integer f;

        System.out.println("Total: " + ((c1*t1) + (c2*t2) +(c3*t3)));
    }
}
