package HW14.model;

public class practicalThread extends Thread {// method for the first practical task

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("I study Java");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

