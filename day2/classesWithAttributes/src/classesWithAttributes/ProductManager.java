package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		// JDBC - Product'ları veri tabanına kaydeder.
		System.out.println("Ürün eklendi " + product.name);
	}
}
