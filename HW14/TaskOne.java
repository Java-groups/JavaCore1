public class TaskOne {
    public static void main(String[] args) throws InterruptedException {
        MyThread firstThread = new MyThread(5, "one", 200);
        MyThread secondThread = new MyThread(5, "two", 200);
        MyThread thirdThread = new MyThread(5, "three", 200);

        firstThread.start();
        secondThread.start();
        firstThread.join();
        secondThread.join();

        thirdThread.start();
        thirdThread.join();
    }
}
