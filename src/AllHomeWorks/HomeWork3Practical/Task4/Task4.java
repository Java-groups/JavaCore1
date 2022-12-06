package AllHomeWorks.HomeWork3Practical.Task4;

import java.io.BufferedReader;
import java.io.IOException;


public class Task4 {
    public static void doTask(BufferedReader br) throws IOException {
        Product mostExpensiveProduct = null;
        Product biggestQuantityProduct = null;

        for (int i = 0; i < 4; i++) {
            System.out.println("---------------------------------------------");
            System.out.println("Product #" + (i + 1));

            Product product = new Product();
            product.input(br);

            if ((mostExpensiveProduct == null) || (product.getPrice() > mostExpensiveProduct.getPrice())) {
                mostExpensiveProduct = product;
            }

            if ((biggestQuantityProduct == null) || (product.getQuantity() > biggestQuantityProduct.getQuantity())){
                biggestQuantityProduct = product;
            }

        }
        System.out.println(mostExpensiveProduct.getName() + " most expensive product with price: " + mostExpensiveProduct.getPrice());
        System.out.println(biggestQuantityProduct.getName() + " has the biggest quantity - " + biggestQuantityProduct.getQuantity());
    }

}

