package HW11.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {

        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println(ReadTheNumber.readTheNumber(5, 50, br));
                } catch (NumberFormatException exception) {
                    System.err.println(exception.getMessage());
                } catch (Exception exception) {
                    System.err.println(exception.getMessage());
                }
            }
        }
    }

