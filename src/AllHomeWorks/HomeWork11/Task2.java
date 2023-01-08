package AllHomeWorks.HomeWork11;

import java.io.BufferedReader;

public class Task2 {
    public static void doTask(BufferedReader br) throws Exception {
        int start = 1;
        for (int i = 0; i < 10; i++) {
            int number = readNumber(br, start, 100);
            start = number;
        }
    }

    public static int readNumber(BufferedReader br, int start, int end) throws Exception {
        System.out.println(String.format("Enter number in range %d - %d:", start, end));
        int number = Integer.parseInt(br.readLine());
        if(number <= start || number >= end){
            throw new Exception(String.format("Number must be in range: %d - %d", start, end));
        }
        return number;
    }
}
