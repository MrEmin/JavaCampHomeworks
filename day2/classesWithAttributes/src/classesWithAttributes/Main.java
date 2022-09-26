package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name = "Laptop";
		product.id = 1;
		product.description = "Apple Macbook Pro";
		product.price = 27.999;
		product.stockAmount = 1200;

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

	}

}
