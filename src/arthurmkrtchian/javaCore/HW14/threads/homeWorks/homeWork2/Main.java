package arthurmkrtchian.javaCore.HW14.threads.homeWorks.homeWork2;

//        Cause a deadlock. Organize the expectations of ending a thread in main(), and make
//        the end of the method main() in this thread


public class Main {
    private static final String firstObject = "First object";
    private static final String secondObject = "Second object";

    public static void main(String[] args) {

        new Thread(() -> {
            synchronized (firstObject) {
                System.out.printf("Thread: %s, locked %s\n",Thread.currentThread().getName(), firstObject);
                try{
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (secondObject){
                    System.out.println("Success!");
                }
            }
        }).start();

            synchronized (secondObject) {
                System.out.printf("Thread: %s, locked %s\n",Thread.currentThread().getName(), secondObject);
                try{
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (firstObject){
                    System.out.println("Success!");
                }
            }
    }
}
