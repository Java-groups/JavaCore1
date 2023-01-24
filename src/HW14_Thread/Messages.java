package HW14_Thread;

public class Messages extends Thread {
    // Run three threads and output there different messages for 5 times.
    // The third thread supposed to start after finishing working of the two previous threads.
    private String messages;
    private int pause;

    public Messages(String messages, int pause) {
        this.messages = messages;
        this.pause = pause; // розумію що за умовою задачи ця змінна не потрібна, зробив щоб повидомлення
        // чередувалися при виведенни на друк
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {

            }
            System.out.println(messages);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Messages("Ser, thread1 is Working!", 150);
        Thread thread2 = new Messages("Ser, thread2 in Action!!", 250);
        Thread thread3 = new Messages("Oh, Ser, thread3 close it carnival", 0);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        thread3.start();
    }
}
