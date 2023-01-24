package PracticalTask15_IO_Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    // Prepare mytext.txt file with a lot of text inside.
    //Read context from file into array of strings.
    //Each array item contains one line from file.
    //Complete next tasks:
    //   1) count and write the number of symbols in every line.
    //   2) find the longest and the shortest line.
    //   3) find and write only that lines, which consist of word «var»

    public static void main(String[] args) throws IOException {
        String fileName = "src/PracticalTask15_IO_Stream/mytext.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line = null;
            int countLine = 0;
            int countLineMax = 0;
            int countLineMin = 0;
            int countNumberOfSymbolsInLine;
            int countNumberOfSymbolsInLineMax = 0;
            int countNumberOfSymbolsInLineMin = 0;

            while ((line = br.readLine()) != null) {
                ++countLine;
                countNumberOfSymbolsInLine = 0;

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) >= 33 && line.charAt(i) <= 126) {
                        countNumberOfSymbolsInLine++;
                    }
                }

                countNumberOfSymbolsInLineMin = countNumberOfSymbolsInLineMin == 0 ? countNumberOfSymbolsInLine : countNumberOfSymbolsInLineMin;

                if (countNumberOfSymbolsInLineMax < countNumberOfSymbolsInLine) {
                    countNumberOfSymbolsInLineMax = countNumberOfSymbolsInLine;
                    countLineMax = countLine;

                } else if (countNumberOfSymbolsInLineMin > countNumberOfSymbolsInLine && countNumberOfSymbolsInLine != 0) {
                    countNumberOfSymbolsInLineMin = countNumberOfSymbolsInLine;
                    countLineMin = countLine;
                }

                if (line.equals("var")) {
                    System.out.println("row: " + countLine + " lines, which consist of word: " + line);
                }
// блок для візуалізації, можно розкоментувати
//                System.out.println("row: " + countLine +
//                        " | countNumberOfSymbolsInLine: " + countNumberOfSymbolsInLine +
//                        " | countNumberOfSymbolsInLineMin: " + countNumberOfSymbolsInLineMin);
            }
            br.close();
            System.out.println("\ncountLineMax: " + countLineMax +
                    "\ncountNumberOfSymbolsInLineMax: " + countNumberOfSymbolsInLineMax +
                    "\n\ncountLineMin: " + countLineMin +
                    "\ncountNumberOfSymbolsInLineMin: " + countNumberOfSymbolsInLineMin);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
