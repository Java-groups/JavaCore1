public class TaskTwo {
    static final String resourceTwo = "resourceTwo";
    static final String resourceOne = "resourceOne";

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            synchronized (resourceOne) {
                System.out.println("Thread 1: locked resource 1");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                synchronized (resourceTwo) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        }).start();

        synchronized (resourceTwo) {
            System.out.println("Thread 2: locked resource 2");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            synchronized (resourceOne) {
                System.out.println("Thread 2: locked resource 1");
            }
        }
    }
}
