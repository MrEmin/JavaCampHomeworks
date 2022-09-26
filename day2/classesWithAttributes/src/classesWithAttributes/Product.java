package classesWithAttributes;

public class Product {

	public Product(int id, String name, String description, double price, int stockAmount, int tax) {
		System.out.println("Yapıcı Blok Çalıştı");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.tax = tax;
	}

	public Product() {

	}

	// attribute | field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private int tax;
	private String kod;

	// getter
	public int getId() {
		return id;
	}

	// setter
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	// read only
	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

}
