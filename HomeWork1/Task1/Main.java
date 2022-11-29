import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Write radius flowers bed:");
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        if(R>0){
            double FBPer = 2 * R * Math.PI;
            double FBArea = Math.PI * Math.pow(R, 2);
            System.out.println("Perimeter = " + FBPer);
            System.out.println("Area = " + FBArea);
        }
        else{
            System.out.println("Your radius less zero");
        }

    }
}