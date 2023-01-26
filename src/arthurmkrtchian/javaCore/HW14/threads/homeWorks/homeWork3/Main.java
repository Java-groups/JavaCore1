package arthurmkrtchian.javaCore.HW14.threads.homeWorks.homeWork3;


//        Create a thread «one», which would start the thread «two», which has to output its
//        number («Thread number two») 3 times and create thread «three», which would to
//        output message «Thread number three» 5 times.


public class Main {
    public static void main(String[] args) {
        new Thread(()->{
           new Thread(()->{
               for (int i = 0; i < 3; i++) {
                   System.out.println("Thread number two");
               }
               new Thread(()->{
                   for (int i = 0; i < 5; i++) {
                       System.out.println("Thread number three");
                   }
               }).start();
           }).start();
        }).start();
    }
}
