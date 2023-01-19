package HW13.task1;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
	private String productName;
	private String manufactureCategory;
	private LocalDate dateOfManufacture;
	private Double price;

	public Product() {
	}

	public Product(String manufactureCategory, String productName, LocalDate dateOfManufacture, Double price) {
		this.manufactureCategory = manufactureCategory;
		this.productName = productName;
		this.dateOfManufacture = dateOfManufacture;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getManufactureCategory() {
		return manufactureCategory;
	}

	public void setManufactureCategory(String manufactureCategory) {
		this.manufactureCategory = manufactureCategory;
	}

	public LocalDate getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(LocalDate dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<Product> sortProducts(List<Product> list, String name, int price) {
		return list.stream().filter(product -> product.getManufactureCategory().equals(name)
				&& product.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)) && product.getPrice() > price)
				.sorted((p1, p2) -> p1.getDateOfManufacture().compareTo(p2.getDateOfManufacture()))
				.collect(Collectors.toList());
	}

	@Override
	public String toString() {
		return "\nManufacture category: " + manufactureCategory + "\nProduct name: " + productName
				+ "\nDate Of Manufacture: " + dateOfManufacture + "\nPrice: " + price + "\n";
	}

}
