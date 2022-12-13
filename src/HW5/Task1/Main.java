package HW5.Task1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Chicken("yes","yes");

        birds[1] = new Eagle("yes","yes");

        birds[2] = new Penguin("no","yes");

        birds[3] = new Swallow("yes","yes");


 //       System.out.println(Arrays.toString(birds));

        for (int i = 0; i < birds.length; i++){
            birds[i].fly();
            System.out.println(birds[i] + " " + birds[i].fly());
        }



    }

}
