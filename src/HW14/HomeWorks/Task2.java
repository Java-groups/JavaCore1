package HW14.HomeWorks;

public class Task2 {
    final static String first = "First";
    final static String second = "Second";
    static Thread thread1 = new Thread() {
        @Override
        public void run() {
            synchronized (first) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                synchronized (second) {
                    System.out.println(thread1.getName());
                }
            }
        }
    };
    static Thread thread2 = new Thread() {
        @Override
        public void run() {
            synchronized (second) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }

                synchronized (first) {
                    System.out.println(thread2.getName());
                }
            }
        }
    };

    public static void main(String[] args) {
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(thread1.getName() + thread1.getState());
        System.out.println(thread2.getName() + thread2.getState());
        System.out.println("end");

    }
}
