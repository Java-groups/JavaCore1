package HW13.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {

	/**
	 * Create class Product with fields manufacture category, date of manufacture and price. 
	 * Add all needed methods: 
	 *     Create list Product with 20 objects;
	 *     Obtain a sorted by the price list of products belong to category Phone with
	 *     price > 3000, and the date of manufacture was more then 1 year ago;
	 *     Realize method.
	 */

	public static void main(String[] args) {
		Product product = new Product();
		
		List<Product> listOfProducts = new ArrayList<>();
		listOfProducts.add(new Product("iPhone", "iPhone 13 Pro Max 512gb", LocalDate.of(2021, 02, 18), 1200.00));
		listOfProducts.add(new Product("iPad", "iPad Pro 10.9' 256gb", LocalDate.of(2022, 06, 07), 900.00));
		listOfProducts.add(new Product("Mac", "MacBook Air Model A2337", LocalDate.of(2021, 01, 11), 1000.00));
		listOfProducts.add(new Product("iPhone", "iPhone 14 Pro 512gb", LocalDate.of(2023, 01, 11), 1500.00));
		listOfProducts.add(new Product("Apple Watch", "Apple Watch 8 45mm", LocalDate.of(2022, 01, 18), 550.00));
		listOfProducts.add(new Product("iPhone", "iPhone 14 Pro 256gb", LocalDate.of(2022, 01, 19), 1300.00));
		listOfProducts.add(new Product("iPad", "iPad Pro 12.9' 512gb", LocalDate.of(2022, 02, 18), 1100.00));
		listOfProducts.add(new Product("Mac", "MacBook Pro 13' Model A4328", LocalDate.of(2022, 06, 07), 1500.00));
		listOfProducts.add(new Product("Apple Watch", "Apple Watch Ultra", LocalDate.of(2022, 01, 18), 890.00));
		listOfProducts.add(new Product("Mac", "MacBook Pro 16' Model A2347", LocalDate.of(2021, 06, 07), 1720.00));
		listOfProducts.add(new Product("Mac", "iMac 24' with Retina 512gb", LocalDate.of(2022, 02, 18), 1850.00));
		listOfProducts.add(new Product("iPhone", "iPhone 13 Pro Max 256gb", LocalDate.of(2021, 02, 19), 1100.00));
		listOfProducts.add(new Product("Mac", "iMac 24' with Retina 1tb", LocalDate.of(2023, 01, 11), 1990.0));
		listOfProducts.add(new Product("Mac", "iMac 27' with Retina 1tb", LocalDate.of(2023, 01, 11), 2300.00));
		listOfProducts.add(new Product("iPad", "iPad Pro 10.9' 512gb", LocalDate.of(2022, 06, 07), 1100.00));
		listOfProducts.add(new Product("Mac", "iMac 27' with Retina 2tb", LocalDate.of(2021, 06, 07), 2800.00));
		listOfProducts.add(new Product("Mac", "Mac Studio 1tb", LocalDate.of(2022, 02, 18), 2700.00));
		listOfProducts.add(new Product("Apple Watch", "Apple Watch SE", LocalDate.of(2022, 01, 18), 350.00));
		listOfProducts.add(new Product("Mac", "Mac Studio 2tb", LocalDate.of(2022, 01, 19), 3100.00));
		listOfProducts.add(new Product("Mac", "Mac Studio 4tb", LocalDate.of(2022, 01, 19), 3500.00));
		listOfProducts.add(new Product("Apple Watch", "Apple Watch 8 41mm", LocalDate.of(2022, 01, 18), 500.00));

		System.out.println(product.sortProducts(listOfProducts, "iPhone", 1000));
	}

}
