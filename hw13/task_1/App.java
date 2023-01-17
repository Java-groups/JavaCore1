package hw13.task_1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Phone", LocalDate.of(2020, 9, 3), 8900),
                new Product("Phone", LocalDate.of(2022, 1, 10), 17500),
                new Product("Phone", LocalDate.of(2022, 1, 8), 2999),
                new Product("Phone", LocalDate.of(2023, 1, 5), 28000),
                new Product("Phone", LocalDate.of(2019, 2, 3), 3620),
                new Product("Phone", LocalDate.of(2021, 7, 14), 4300),
                new Product("Phone", LocalDate.of(2022, 8, 15), 1999),
                new Product("TV", LocalDate.of(2019, 5, 9), 10000),
                new Product("Tablet", LocalDate.of(2020, 5, 6), 6700),
                new Product("Microwave", LocalDate.of(2005, 8, 31), 2380),
                new Product("Washing machine", LocalDate.of(2022, 12, 7), 15099),
                new Product("Notebook", LocalDate.of(2021, 3, 8), 30000),
                new Product("Tablet", LocalDate.of(2018, 8, 8), 4070),
                new Product("TV", LocalDate.of(2021, 6, 29), 13800),
                new Product("Notebook", LocalDate.of(2017, 4, 20), 9630),
                new Product("Microwave", LocalDate.of(2018, 10, 31), 7800),
                new Product("Washing machine", LocalDate.of(2008, 7, 3), 5420),
                new Product("Notebook", LocalDate.of(2022, 9, 24), 7840),
                new Product("Tablet", LocalDate.of(2020, 5, 6), 6700),
                new Product("TV", LocalDate.of(2023, 1, 5), 8000));
        products.stream()
                .filter(p -> p.getManufactureCategory().equals("Phone"))
                .filter(App::manufacturedMoreThanYearAgo)
                .filter(p -> p.getPrice() > 3000)
                .sorted(Comparator.comparingInt(Product::getPrice))
                .forEach(System.out::println);
    }

    private static boolean manufacturedMoreThanYearAgo(Product product) {
        LocalDate dateOfManufacture = product.getDateOfManufacture();
        return ChronoUnit.YEARS.between(dateOfManufacture, LocalDate.now()) >= 1;
    }
}
