package arthurmkrtchian.javaCore.HW01.javaIntroduction.homeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//        Phone calls from three different countries are с1, с2 and с3 standard units per minute.
//        Talks continued t1, t2 and t3 minutes. How much computer will count for each call
//        separately and all talk together? Input all source data from console, make calculations and
//        output to the screen


public class Main {
    public static void main(String[] args) throws IOException {
        int c1, c2, c3;
        int t1, t2, t3;
        int r1, r2, r3, total;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hi, how you doing? Let's find out which bill you'll get this month.");
        System.out.println("Call price to the first country (per minute):");
        c1 = Integer.parseInt(br.readLine());
        System.out.println("Call duration (minutes):");
        t1 = Integer.parseInt(br.readLine());

        System.out.println("Call price to the second country (per minute):");
        c2 = Integer.parseInt(br.readLine());
        System.out.println("Call duration (minutes):");
        t2 = Integer.parseInt(br.readLine());

        System.out.println("Call price to the third country (per minute):");
        c3 = Integer.parseInt(br.readLine());
        System.out.println("Call duration (minutes):");
        t3 = Integer.parseInt(br.readLine());

        r1 = getCoast(c1,t1);
        r2 = getCoast(c2,t2);
        r3 = getCoast(c3,t3);
        total = r1+ r2+ r3;
        System.out.println("The amount for the call to the first country is: " + r1);
        System.out.println("The amount for the call to the second country is: " + r2);
        System.out.println("The amount for the call to the third country is: " + r3);
        System.out.println("The amount you need to pay is: " + total);


    }

    public static int getCoast(int price, int duration){
        return price*duration;
    }

}
