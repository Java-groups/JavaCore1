package arthurmkrtchian.javaCore.HW03.conditionStatements.practicalTasks.practicalTask4;


//      Create class Product with fields name, price and quantity
//          • Create four instances of type Product
//          • Display the name and quantity of the most expensive item
//          • Display the name of the items, which has the biggest quantity


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Product("Laptop", 124, 999);
        products[1] = new Product("Phone", 73, 799);
        products[2] = new Product("Charger", 76, -59);
        products[3] = new Product("Space Blaster", 2, 1000000);

        Product mostExpensive = new Product("All products",0,0); // Ось тут питання. Чи це я так адекватно реалізував? Можливо можна було б більш грамотно це зробити?
        Product hasBiggestQuantity = mostExpensive;

        for (int i = 0; i < products.length; i++) {
            if (mostExpensive.getPrice() < products[i].getPrice()){
                mostExpensive = products[i];
            }
        }

        System.out.printf("Most expensive product name is: %s\n\tIt`s quantity is: %s\n\n",
                mostExpensive.getName(),
                mostExpensive.getQuantity()
        );

        System.out.println("Here is the sorted list of products by quantity (descending)");
        Arrays.sort(products);
        String tableFormat = "| %-15s | %-8s | %-8s |%n";
        System.out.println("+-----------------+----------+----------+");
        System.out.format(tableFormat,"Product", "Quantity", "Price");
        System.out.println("+-----------------+----------+----------+");
        for (int i = 0; i < products.length; i++) {
            System.out.format(tableFormat, products[i].getName(), products[i].getQuantity(), products[i].getPrice());
            System.out.println("+-----------------+----------+----------+");
            //System.out.printf("\tName: %s\tPrice: %s\n",products[i].getName(), products[i].getPrice());
        }

    }
}
