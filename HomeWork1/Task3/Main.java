import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Write 3 price for 3 countries:");
        Scanner MC = new Scanner(System.in);
        System.out.println("First counrty: ");
        int c1 = MC.nextInt();
        System.out.println("Second counrty: ");
        int c2 = MC.nextInt();
        System.out.println("Third counrty: ");
        int c3 = MC.nextInt();



        System.out.println("How long was your call?");
        System.out.println("Minutes for first counrty: ");
        int t1 = MC.nextInt();
        System.out.println("Minutes for second counrty: ");
        int t2 = MC.nextInt();
        System.out.println("Minutes for third counrty: ");
        int t3 = MC.nextInt();

        if(c1>=0 && c2>=0 && c3>=0 && t1>=0 && t2>=0 && t3>= 0) {
            System.out.println("Result first country: " + c1 * t1);
            System.out.println("Result second country: " + c2 * t2);
            System.out.println("Result third country: " + c3 * t3);
            int resultAllCountries = (c1 * t1) + (c2 * t2) + (c3 * t3);
            System.out.println("Result all countries: " + resultAllCountries);
        }
        else {
            System.out.println("Your value under zero");
        }



    }
}