package AllHomeWorks.HomeWork1;
import Helper.InputHelper;

import java.io.BufferedReader;
import java.io.IOException;

public class KyivStarTask {
        public static void doTask(BufferedReader br) throws IOException {

            System.out.println("Enter price for phone number, country 1");
            int c1 =InputHelper.inputInteger(br);
            System.out.println("Enter price for phone number, country 2");
            int c2 =InputHelper.inputInteger(br);
            System.out.println("Enter price for phone number, country 3");
            int c3 =InputHelper.inputInteger(br);

            System.out.println("How long did you talk with country 1?");
            int t1 =InputHelper.inputInteger(br);
            System.out.println("How long did you talk with country 2?");
            int t2 =InputHelper.inputInteger(br);
            System.out.println("How long did you talk with country 3?");
            int t3 =InputHelper.inputInteger(br);


            System.out.println("Talking with country 1 costs " +(c1*t1) +"units");
            System.out.println("Talking with country 2 costs " +(c2*t2) +"units");
            System.out.println("Talking with country 3 costs " +(c1*t3) +"units");
            System.out.println("Talking with all countries costs " +((c1*t1)+(c2*t2)+(c3*t3)) +"units");
    }
}
