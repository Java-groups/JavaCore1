package HW15.PracticalTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pt1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Start of the first practical task");
        File file = new File("myScript");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String str;

        ArrayList<String> list = new ArrayList<String>();
        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);
                System.out.println(str);
            }
        }
        String[] stringArr = list.toArray(new String[0]);
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder(stringArr[0]);
        int max = stringBuilder.capacity();
        int min = stringBuilder.capacity();
        for (int i = 0; i < stringArr.length; i++) {
            stringBuilder = new StringBuilder(stringArr[i]);
            count++;
            System.out.println("Line " + count + " has " + stringBuilder.capacity() + " symbols");
            if (max < stringBuilder.capacity()) {
                max = stringBuilder.capacity();
            }
            if (min > stringBuilder.capacity()) {
                min = stringBuilder.capacity();
            }
        }
        System.out.println("The biggest count of symbols: "+max);
        System.out.println("The smallest count of symbols: "+min);
//        2) find the longest and the shortest line.
        for (int i = 0; i < stringArr.length; i++) {
            stringBuilder = new StringBuilder(stringArr[i]);
            if (max == stringBuilder.capacity()) {
                System.out.println("The longest line: " + stringArr[i]);
            }
            if (min == stringBuilder.capacity()) {
                System.out.println("The shortest line: " + stringArr[i]);
            }
        }
//        3) find and write only that lines, which consist of word �var�
        String pattern = "var";
        Pattern p = Pattern.compile(pattern);
        for (int i = 0; i < stringArr.length; i++) {
            Matcher m = p.matcher(stringArr[i]);
            if (m.find()) {
                System.out.println("The line, witch consist of word 'var': " + stringArr[i]);
            }
        }


    }

    public static class Pt2 {
        public static void main(String[] args) throws IOException {
            System.out.println("Start of the second practical task");
            File file = new File("myScript");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String str;

            ArrayList<String> list = new ArrayList<String>();
            while ((str = reader.readLine()) != null) {
                if (!str.isEmpty()) {
                    list.add(str);
                    System.out.println(str);
                }
            }
            String[] ArrayOfText = list.toArray(new String[0]);
            for (int i = 0; i < ArrayOfText.length; i++) {
                String[] wordInArray = ArrayOfText[i].split(" ");
                for (int j = 0; j < wordInArray.length; j++) {
                    if (wordInArray[j].startsWith("A") || wordInArray[j].startsWith("E")
                            || wordInArray[j].startsWith("I") || wordInArray[j].startsWith("O")
                            || wordInArray[j].startsWith("U") || wordInArray[j].startsWith("a")
                            || wordInArray[j].startsWith("e") || wordInArray[j].startsWith("i")
                            || wordInArray[j].startsWith("u") || wordInArray[j].startsWith("o")) {
                        System.out.println("Слова які починаються з голосної літери: "+wordInArray[j]);
                    }
                }
            }
            System.out.println("************************************");
            for (int i = 0; i < ArrayOfText.length; i++) {
                String[] sameLetter = ArrayOfText[i].split(" ");
                for (int j = 0; j < sameLetter.length - 1; j++) {
                    if (sameLetter[j].length() > 0 && sameLetter[j + 1].length() > 0 && sameLetter[j].charAt(sameLetter[j].length() - 1) == (sameLetter[j + 1].charAt(0))) {
                        System.out.println(sameLetter[j] + "->" + sameLetter[j + 1]);
                    }
                }
            }
        }
    }
}
