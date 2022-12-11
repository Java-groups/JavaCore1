package HW1;

import java.util.Scanner;

public class Introduction_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Яке в тебе звати?");
        String name = scanner.nextLine();
        System.out.println("Де ти мешкаєшь, " + name + "?");
        String address = scanner.nextLine();
        System.out.println(name + "\t" + address);
    }
}
