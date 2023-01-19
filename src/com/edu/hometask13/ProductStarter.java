package com.edu.hometask13;
/*
     1. Create class Product with fields manufacture category, date of manufacture and price. Add all
        needed methods
        • Create list Product with 20 objects
        • Obtain a sorted by the price list of products belong to category Phone with
        price > 3000, and the date of manufacture was more then 1 year ago.
*/
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


public class ProductStarter {
    public static void main(String[] args) {
        Product p = new Product();

        List<Product> products = Arrays.asList(
                new Product("Phone", LocalDate.of(2022, 1, 18), 6543),
                new Product("Phone", LocalDate.of(2020, 7, 30), 2100),
                new Product("Phone", LocalDate.of(2012, 4, 6), 4222),
                new Product("Phone", LocalDate.of(2020, 3, 21), 1299),
                new Product("Coffee Maker", LocalDate.of(2019, 6, 8), 700),
                new Product("Phone", LocalDate.of(2021, 7, 1), 600),
                new Product("Phone", LocalDate.of(2022, 7, 9), 1233),
                new Product("Blender", LocalDate.of(2021, 12, 8), 5332),
                new Product("Hair Dryer", LocalDate.of(2019, 8, 12), 7555),
                new Product("Oven", LocalDate.of(2023, 2, 12), 23234),
                new Product("PC", LocalDate.of(2018, 1, 26), 4756),
                new Product("PC", LocalDate.of(2020, 8, 8), 2542),
                new Product("Oven", LocalDate.of(2019, 4, 1), 47563),
                new Product("Phone", LocalDate.of(2018, 9, 2), 10000),
                new Product("Hair Dryer", LocalDate.of(2020, 12, 14), 42518),
                new Product("Hair Dryer", LocalDate.of(2012, 10, 7), 109837),
                new Product("Blender", LocalDate.of(2021, 3, 20), 1431),
                new Product("Oven", LocalDate.of(2016, 1, 12), 7625),
                new Product("PC", LocalDate.of(2018, 9, 19), 3134),
                new Product("Oven", LocalDate.of(2009, 3, 21), 1234));


        System.out.println(p.sortedProducts(products));
    }
}





