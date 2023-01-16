package HW14.HomeWorks;

public class AnotherThread extends Thread {
    private String text;
    Thread thread2 = null;
    Thread thread3 = null;


    public AnotherThread(String text) {
        this.text = text;
    }

    public AnotherThread(Thread thread2, Thread thread3) {

        this.thread2 = thread2;
        this.thread3 = thread3;
    }


    @Override
    public void run() {
        if (!(thread2 == null)) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
            thread2.run();
            try {
                thread2.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            if (!(thread3 == null)) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                }
            }

        }
//        for (int i = 0; i < number; i++) {
//            System.out.println(text);
//            try {
//                Thread.sleep(pause);
//            } catch (InterruptedException e) {
//                System.err.println(e.getMessage());
//            }
//        }
    }
}
