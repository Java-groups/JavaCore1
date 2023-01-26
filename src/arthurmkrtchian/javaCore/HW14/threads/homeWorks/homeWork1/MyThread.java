package arthurmkrtchian.javaCore.HW14.threads.homeWorks.homeWork1;


//          Run three threads and output there different messages for 5 times. The third thread
//          supposed to start after finishing working of the two previous threads.


public class MyThread implements Runnable {
     private final int iterations;

    public MyThread(int iterations) {
        this.iterations = iterations;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.iterations; i++) {
            System.out.println(Thread.currentThread().getName() +
                    ". Iteration: " + this.iterations);
        }
    }
}
