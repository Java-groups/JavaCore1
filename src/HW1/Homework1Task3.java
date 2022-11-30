package HW1;

import java.util.Scanner;
/* Phone calls from three different countries are с1, с2 and с3 standard units per minute.
 *  Talks continued t1, t2 and t3 minutes. How much computer will count for each call separately and all talk together?
 *  Input all source data from console, make calculations and output to the screen.
 */
public class Homework1Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter standard units per minute for 1st call c1 ");
        int c1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter standard units per minute for 2nd call c2 ");
        int c2 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter standard units per minute for 3rd call c3 ");
        int c3 = Integer.parseInt(sc.nextLine());

        System.out.println("Enter minutes for 1st call t1 ");
        int t1 = Integer.parseInt(sc.nextLine());
        int cost1stCall = c1*t1;

        System.out.println("Enter minutes for 2nd call t2 ");
        int t2 = Integer.parseInt(sc.nextLine());
        int cost2ndCall = c2*t2;

        System.out.println("Enter minutes for 3nd call t3 ");
        int t3 = Integer.parseInt(sc.nextLine());
        int cost3rdCall = c3*t3;
        int sumOfAllCalls =cost1stCall +cost2ndCall+cost3rdCall;

        System.out.println("1st call price = "+cost1stCall+"\n2nd call price = "+cost2ndCall+"\n3rdt call price = "+cost3rdCall);
        System.out.println("price of all calls "+sumOfAllCalls);
    }
}
