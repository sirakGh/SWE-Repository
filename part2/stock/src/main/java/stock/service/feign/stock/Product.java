package stock.service.feign.stock;

public class Product {
	private String productNumber;
	private String name;
	private String numberInStock;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productNumber, String name, String numberInStock) {
		super();
		this.productNumber = productNumber;
		this.name = name;
		this.numberInStock = numberInStock;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumberInStock() {
		return numberInStock;
	}

	public void setNumberInStock(String numberInStock) {
		this.numberInStock = numberInStock;
	}
}
