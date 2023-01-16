package arthurmkrtchian.javaCore.HW11.exceptions.homeWorks.homeWork2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//        2. Write a method readNumber(int start, int end), that read from console integer number
//        and return it, if it is in the range [start...end].
//        If an invalid number or non-number text is read, the method should throw an exception.
//        Using this method write a method main(), that has to enter 10 numbers:
//        a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100

public class Main {
    static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static final int iterations = 10;

    public static void main(String[] args) {
        Range range = new Range(1,100);
        for (int i = 0; i < iterations; i++) {
            System.out.printf("Enter a number from the range from %d to %d: ", range.getStart(), range.getEnd());
            while(true){
                try {
                    range.setStart(readNumber(range.getStart(), range.getEnd()));
                    break;
                } catch (IllegalArgumentException | IOException e){
                    e.printStackTrace();
                    System.err.println("Incorrect input. Please try again.");
                }
            }
            if (range.getEnd() - range.getStart() < (iterations - i)){
                System.out.println("That's it. There's no point in continuing.");
                break;
            }
        }
    }

    private static int readNumber(int start, int end) throws IOException {
        int num;
            num = Integer.parseInt(reader.readLine());
            if (num <= start || num >= end){
                throw new IllegalArgumentException();
            }
            return num;
    }
}
