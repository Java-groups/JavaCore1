public class MyThread  extends Thread{
    private int number;
    private String message;
    private int pause;

    public MyThread(int amount, String message, int pause) {
        this.number = amount;
        this.message = message;
        this.pause = pause;
    }

    @Override
    public void run() {
        for (int i = 0; i < number; i++) {
            System.out.println(message);
            try {
                sleep(pause);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());;
            }
        }
    }
}
