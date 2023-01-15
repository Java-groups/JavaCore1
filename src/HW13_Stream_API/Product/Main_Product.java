package HW13_Stream_API.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main_Product {
    public static void main(String[] args) {
        List<Product> listProducts = new ArrayList<>();
        listProducts.add(new Product("Phone", LocalDate.of(2022,01,14),4000));
        listProducts.add(new Product("Phone", LocalDate.of(2020,12,18),5000));
        listProducts.add(new Product("Phone", LocalDate.of(2021,10,15),10000));
        listProducts.add(new Product("Phone", LocalDate.of(2022,05,13),7000));
        listProducts.add(new Product("TV", LocalDate.of(2023,01,10),4000));
        listProducts.add(new Product("Phone", LocalDate.of(2021,03,10),5000));
        listProducts.add(new Product("TV", LocalDate.of(2021,04,10),8000));
        listProducts.add(new Product("Phone", LocalDate.of(2022,05,10),2000));
        listProducts.add(new Product("TV", LocalDate.of(2020,06,10),9000));
        listProducts.add(new Product("Phone", LocalDate.of(2019,05,10),1000));
        listProducts.add(new Product("Monitor", LocalDate.of(2022,07,10),1000));
        listProducts.add(new Product("Phone", LocalDate.of(2021,11,10),1000));
        listProducts.add(new Product("Monitor", LocalDate.of(2020,06,10),4000));
        listProducts.add(new Product("Phone", LocalDate.of(2020,07,10),1000));
        listProducts.add(new Product("TV", LocalDate.of(2021,06,10),1000));
        listProducts.add(new Product("Phone", LocalDate.of(2023,01,10),1000));
        listProducts.add(new Product("Monitor", LocalDate.of(2022,03,10),1000));
        listProducts.add(new Product("Phone", LocalDate.of(2023,04,10),1000));
        listProducts.add(new Product("TV", LocalDate.of(2023,07,10),1000));
        listProducts.add(new Product("Phone", LocalDate.of(2022,06,5),1000));

        List<Product> filtrList = listProducts.stream()
                .filter(product ->
                        product.getPrice() > 3000 &&
                        product.getManufactureCategory().equals("Phone") &&
                        product.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .toList();

        System.out.println(filtrList);
    }
}
