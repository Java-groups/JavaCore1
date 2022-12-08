package AllHomeWorks.HomeWork3.Task1.Part3;

import java.io.BufferedReader;
import java.io.IOException;

public class Part3 {
    public static void doTask(BufferedReader br) throws IOException {
        String x = "";
        do {
            System.out.println();
            System.out.println("Please input HTTP Error (400 - 407), or 0 - for exit:");
            x = br.readLine();


            if ("0".equals(x)) {
                return;
            } else {
                for (HTTPError httpError : HTTPError.values()) {
                    if (httpError.getErrorNum().contains(x)) {
                        System.out.println(x + " - Error - " + httpError.getErrorDisc());
                        break;
                    }
                }
            }
        } while (x != "0");
    }
}