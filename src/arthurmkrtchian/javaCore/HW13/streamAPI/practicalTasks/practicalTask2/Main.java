package arthurmkrtchian.javaCore.HW13.streamAPI.practicalTasks.practicalTask2;


//        2. For given collection
//        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
//        calculate count, min, max, sum, for numbers and print all results

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.printf("Count is: %d\n", (long) primes.size());
        System.out.printf("Min value is: %d\n", primes.stream().min((x,y) -> x-y).get());
        System.out.printf("Max value is: %d\n", primes.stream().max((x,y) -> x-y).get());
        System.out.printf("Sum is: %d\n", primes.stream().reduce(0,Integer::sum));
    }
}
