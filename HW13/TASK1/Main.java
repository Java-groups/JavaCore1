import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (i%2 == 0) {
                products.add(new Product("phone", LocalDate.of((2003+i), 10, 10), 2990+i));
            } else {
                products.add(new Product("notPhone", LocalDate.of((2003+i), 11, 11), 3000+i));
            }
        }
        products.forEach(System.out::println);
        List<Product> phones = products.stream().
                filter(product -> product.getCategory() == "phone").
                filter(product -> product.getPrice() > 3000).
                filter(product -> Period.between(product.getDate(), LocalDate.now()).getYears() > 1).
                sorted(Comparator.comparingInt(Product::getPrice)).toList();
        System.out.println("Filtered and sorted list");
        phones.forEach(System.out::println);
    }
}