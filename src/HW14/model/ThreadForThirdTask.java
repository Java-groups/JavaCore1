package HW14.model;

public class ThreadForThirdTask extends Thread {
    private String message;
    Thread t2 = null;
    Thread thread = null;

    public ThreadForThirdTask(String text) {
        this.message = message;

    }

    public ThreadForThirdTask(Thread t2, Thread thread) {
        this.t2 = t2;
        this.thread = thread;
    }

    @Override
    public void run() {
        if (!(t2 == null)) {
            for (int i = 0; i < 3; i++) {
                System.out.println("lalalalal");
            }
            t2.run();
            try {
                t2.join();
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            if (!(thread == null)) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("lulululu");
                }
            }

        }
    }
}
