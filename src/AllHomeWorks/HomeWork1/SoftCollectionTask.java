package AllHomeWorks.HomeWork1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SoftCollectionTask {
        public static void doTask() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Hello. What is your name?");
            String user_name = br.readLine();
            System.out.println("Where are you live," +user_name +"?");
            String user_address = br.readLine();
            System.out.println("Name - " + user_name +"\n" +"Address - " +user_address);
        }
    }

