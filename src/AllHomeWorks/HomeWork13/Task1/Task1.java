package AllHomeWorks.HomeWork13.Task1;

import Helper.RandomHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Task1 {

    public static void doTask(BufferedReader br) throws IOException {

        ArrayList<Product> productList = new ArrayList<>();

        ArrayList<String> typesList = new ArrayList<>(
                Arrays.asList(
                        "Phone",
                        "Notebook",
                        "Mouse",
                        "Fridge",
                        "Keyboard",
                        "Monitor",
                        "Chair"
                )
        );


        for (int i = 0; i < 20; i++) {
            productList.add(
                    new Product(
                            RandomHelper.randomElementFromList(typesList),
                            RandomHelper.positiveIntegerMinMax(2000, 2023),
                            RandomHelper.positiveIntegerMinMax(1000, 10000)
                    )
            );
        }

        /**
         Obtain a sorted by the price list of products belong to category Phone with
         price > 3000, and the date of manufacture was more then 1 year ago
         */

        productList.sort(Comparator.comparing(Product::getPrice));

        for (Product product : productList) {
            System.out.printf("type: %s, year: %d, price: %d \n", product.getManufactureCategory(), product.getManufactureDate(), product.getPrice());
        }

        int yearToCompare = LocalDate.now().getYear() - 1;

        List<Product> filtered = productList.stream().filter(
                product -> product.getPrice() > 3000
                        && product.getManufactureCategory().equals("Phone")
                        && product.getManufactureDate() < yearToCompare
        ).toList();

        System.out.println("\nPopular category is: " + Product.mostPopularCategory(productList.stream()).orElse("Unknown"));

        System.out.println("\nFiltered products with price > 3000 && category == Phone && year < currentYear - 1");
        for (Product product : filtered) {
            System.out.printf("type: %s, year: %d, price: %d \n", product.getManufactureCategory(), product.getManufactureDate(), product.getPrice());
        }


    }
}
