package PracticalTask14_Thread;

public class Messages extends Thread {
    //  Output two messages «Hello, world» and «Peace in the peace» 5 times each with the intervals of 2 seconds,
    //  and the second - 3 seconds. After printing messages, print the text «My name is …»

    private String text;
    private int pause;

    public Messages(String text, int pause) {
        this.text = text;
        this.pause = pause;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
            }
            System.out.println(text);
        }
    }

    public static void main(String[] args) throws Exception {
        Thread thread1 = new Messages("t1  Hello, world", 2000);
        Thread thread2 = new Messages("t2  Peace in the peace", 3000);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("\nMy name is Daemon Thread");
    }
}
