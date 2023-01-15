package PrecticalTask13_Stream_API;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics rowStatistic = primes.stream()
                .mapToInt((x) -> x)
                .summaryStatistics();
        // calculate count, min, max, sum, for numbers and print all results
        System.out.println("calculate count: " + rowStatistic.getCount());
        System.out.println("calculate min: " + rowStatistic.getMin());
        System.out.println("calculate max: " + rowStatistic.getMax());
        System.out.println("calculate sum: " + rowStatistic.getSum());
    }

}
