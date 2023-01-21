package HW14.model;

public class MyThread extends Thread  {
    private int number;
    private int pause;
    private String textMessage;
    Thread thread = null;

    public MyThread(int number, int pause, String textMessage) {
        this.number = number;
        this.pause = pause;
        this.textMessage = textMessage;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPause() {
        return pause;
    }

    public void setPause(int pause) {
        this.pause = pause;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        for (int i = 0; i < number; i++) {
            System.out.println(textMessage);
            try {
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
