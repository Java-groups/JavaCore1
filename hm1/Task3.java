package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("write three units");
        int c1 = Integer.parseInt(br.readLine());
        int c2 = Integer.parseInt(br.readLine());
        int c3 = Integer.parseInt(br.readLine());
        System.out.println("how long three talks continued");
        int t1 = Integer.parseInt(br.readLine());
        int t2 = Integer.parseInt(br.readLine());
        int t3 = Integer.parseInt(br.readLine());
        System.out.println("1 call costs " + (c1*t1));
        System.out.println("2-d call costs " + (c2*t2));
        System.out.println("3-d call costs " + (c3*t3));
        System.out.println("All calls costs " + ((c1*t1)+(c2*t2)+(c3*t3)));



    }
}
