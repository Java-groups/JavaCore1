package arthurmkrtchian.javaCore.HW14.threads.homeWorks.homeWork1;


//          Run three threads and output there different messages for 5 times. The third thread
//          supposed to start after finishing working of the two previous threads.


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        runFirs(Arrays.asList(
                new Thread(new MyThread(5)),
                new Thread(new MyThread(5))
                )
        );

        Thread t3 = new Thread(new MyThread(5));
        t3.start();
    }

    private static void runFirs(List<Thread> threads) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (Thread thread : threads) {
            executor.execute(thread);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
    }

}
