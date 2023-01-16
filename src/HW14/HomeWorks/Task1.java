package HW14.HomeWorks;



public class Task1 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread(5,100,"First");
        MyThread thread2 = new MyThread(5,200,"Second");
        MyThread thread3 = new MyThread(5,300,"Third");
        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        thread3.start();
        try{
            thread3.join();
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("end");
    }
}
