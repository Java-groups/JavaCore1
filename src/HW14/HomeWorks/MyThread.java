package HW14.HomeWorks;

public class MyThread extends Thread {
    private int number;
    private int pause;
    private String text;


    public MyThread(int number, int pause, String text) {
        this.number = number;
        this.pause = pause;
        this.text = text;
    }


    @Override
    public void run() {
        for (int i = 0; i < number; i++) {
            System.out.println(text);
            try {
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
