package AllHomeWorks.HomeWork15;

import java.io.*;

public class Task1 {
    public static void doTask(BufferedReader br) throws IOException {
        String fileName = "Career.txt";
        int count = 0;
        String s1 = "";

        try (
                FileReader fr = new FileReader(fileName);
                BufferedReader br1 = new BufferedReader(fr)
        ) {
            String s = null;
            System.out.println("Read data from file: " + fileName);
            while ((s = br1.readLine()) != null) {
                System.out.println("row " + count + " read: " + s);

                if (s1.length() <= s.length()) {
                    s1 = s;
                }
                count++;

            }
            System.out.println("\nNumber of Strings = " + count);
            System.out.println("\nThe longest String is " + s1);

        } catch (Exception e) {
            e.printStackTrace();
        }

        String fileName2 = "File2.txt";

        try (
                FileWriter fr1 = new FileWriter(fileName2);
                BufferedWriter br2 = new BufferedWriter(fr1)
        ) {
            System.out.println("\nWrite data to file: " + fileName2);
            br2.write("");
            br2.append(String.valueOf(count));
            br2.append("/n");
            br2.append(s1);
            br2.append("/n");
            br2.append("14 February");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
