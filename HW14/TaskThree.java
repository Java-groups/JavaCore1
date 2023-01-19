public class TaskThree {
    public static void main(String[] args) {
        new Thread(() -> {
            new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
                new Thread(() -> {
                    for (int i = 0; i < 3; i++) {
                        System.out.println(Thread.currentThread().getName());
                    }
                }, "Third").start();
            }, "Second").start();
        }, "First").start();
    }
}