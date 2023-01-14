package AllHomeWorks.HomeWork13Practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Task2 {
    public static void doTask(BufferedReader br) throws IOException {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        int countPrimes = primes.size();
        System.out.printf("\nCount of Prime = %d", countPrimes);
        int maxPrime = primes.stream().max(Comparator.naturalOrder()).get();
        System.out.printf("\nMax Prime = %d", maxPrime);
        int minPrime = primes.stream().min(Comparator.naturalOrder()).get();
        System.out.printf("\nMin Prime = %d", minPrime);

        AtomicInteger sum = new AtomicInteger();
        primes.forEach(sum::addAndGet);
        System.out.printf("\nSum of elements = %d \n", sum.intValue());


    }
}
