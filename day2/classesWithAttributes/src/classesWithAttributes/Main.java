package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Apple Macbook Pro", 27.999, 1200, 18);
//		Product product = new Product();
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Apple Macbook Pro");
//		product.setPrice(27.999);
//		product.setStockAmount(1200);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}

}
