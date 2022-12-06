package AllHomeWorks.HomeWork3Practical.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void doTask() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = "";
        Continent selectedContinent = null;

        do {
            System.out.println();
            System.out.println("Please input Country, or 0 - for exit:");
            x = br.readLine();


            if ("0".equals(x)) {
                return;
            } else {
                for (Continent continent : Continent.values()) {
                    if (continent.getCountry().contains("," + x + ",")) {
                        System.out.println(x + " is in a continent - " + continent.getContinent());
                        break;
                    }
                }
            }
        }  while (x != "0") ;






    }
}
