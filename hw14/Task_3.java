package hw14;

public class Task_3 {
    public static void main(String[] args) {
        new Thread(() -> {
            new Thread(() -> {
                new Thread(() -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread number three");
                    }
                }).start();
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
            }).start();
        }).start();
    }
}
