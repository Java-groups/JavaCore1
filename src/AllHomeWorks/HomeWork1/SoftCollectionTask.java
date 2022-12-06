package AllHomeWorks.HomeWork1;
import java.io.BufferedReader;
import java.io.IOException;

public class SoftCollectionTask {
        public static void doTask(BufferedReader br) throws IOException {

            System.out.println("Hello. What is your name?");
            String user_name = br.readLine();
            System.out.println("Where are you live," +user_name +"?");
            String user_address = br.readLine();
            System.out.println("Name - " + user_name +"\n" +"Address - " +user_address);
        }
    }

