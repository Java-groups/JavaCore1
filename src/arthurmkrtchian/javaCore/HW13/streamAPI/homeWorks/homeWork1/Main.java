package arthurmkrtchian.javaCore.HW13.streamAPI.homeWorks.homeWork1;


//        1. Create class Product with fields manufacture category, date of manufacture and price. Add all
//        needed methods
//        • Create list Product with 20 objects
//        • Obtain a sorted by the price list of products belong to category Phone with
//        price > 3000, and the date of manufacture was more then 1 year ago.
//        • Realize method
//        static Optional<String> mostPopularName(Stream< Employee> employees) {
//        return null; }


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static final Random random = new Random();

    public static void main(String[] args) {
        List<Product> initialList = fillList();
        System.out.println("Initial list:");
        initialList.forEach(System.out::println);

        System.out.println("\nPhones over $3000:");
        initialList.stream().filter(x->x.getCategory() == Category.PHONE).filter(x->x.getPrice()>3000).forEach(System.out::println);
    }


    private static List<Product> fillList() {

        List<Product> result = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            result.add(new Product(Category.randomCategory(), LocalDate.of(getYear(), getMonth(), getDay()), getPrice()));
        }
        return result;
    }

    static private int getYear() {
        return random.nextInt(123) + 1900;
    }

    static private int getMonth() {
        return random.nextInt(11) + 1;
    }

    static private int getDay() {
        return random.nextInt(27) + 1;
    }

    static private int getPrice() {
        return random.nextInt(5000);
    }
}
