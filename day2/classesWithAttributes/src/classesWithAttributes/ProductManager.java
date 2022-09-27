package classesWithAttributes;

public class ProductManager {
	public void add(Product product) {
		// JDBC - Product'ları veri tabanına kaydeder.
		System.out.println("Ürün eklendi " + product.getName());
	}

	public void add2(int id, String name, String description, int stockAmount, double price, int tax) {
		// Bu çok hatalı bir kullanımdır.
	}
}
