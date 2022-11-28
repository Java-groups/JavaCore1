import java.util.Scanner;

public class Introduction_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ціна дзвинка, грн за 1 хвилину (задайте с1, с2, с3)");
        Double price_1 = scanner.nextDouble();
        Double price_2 = scanner.nextDouble();
        Double price_3 = scanner.nextDouble();
        System.out.println("Тривалість розмови у хвілінах (задайте t1, t2, t3)");
        Double time_1 = scanner.nextDouble();
        Double time_2 = scanner.nextDouble();
        Double time_3 = scanner.nextDouble();
        System.out.println("Вартість першого дзвінка: " + (price_1 * time_1) + " грн\n" +
                "Вартість другого дзвінка: " + (price_2 * time_2) + " грн\n" +
                "Вартість третього дзвінка: " + (price_3 * time_3) + " грн\n" +
                "Вартість усіх дзвінків: " + (price_1 * time_1 + price_2 * time_2 + price_3 * time_3) + " грн\n");
    }
}
