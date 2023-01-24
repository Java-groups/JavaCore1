package AllHomeWorks.HomeWork15;

import java.io.*;

/**A file with java code is given.
 * Read program text from file and all words public
 * in the declaration of class attributes and methods
 * should be replaced with the word private.
 * Save the result to another previously created file.
 */
public class Task2 {
    public static void doTask(BufferedReader br) throws IOException {
        String fileName = "JavaCode.txt";
        String fileName2 = "PrivateJavaCode.txt";

        try (
                FileReader fr = new FileReader(fileName);
                BufferedReader br1 = new BufferedReader(fr);
                FileWriter fr1 = new FileWriter(fileName2);
                BufferedWriter br2 = new BufferedWriter(fr1)
        ) {
            br2.write("");
            String s = null;
            System.out.println("Read data from file: " + fileName);
            while ((s = br1.readLine()) != null) {
                br2.append(s.replaceAll("\\bpublic\\b(?!\\W+class)", "private"));
                br2.append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}