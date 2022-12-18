package arthurmkrtchian.javaCore.OOP1.homeWorks.homeWork1;

public class Main {

    public static void main(String[] args) {
        Bird[] birds = {
              new Chiken(true, true),
              new Eagle(true,true),
              new Swallow(true,true),
              new Penguin(true,true)
        };

        System.out.println("\n");
        for (int i = 0; i < birds.length; i++) {
            birds[i].fly();
        }
    }
}
