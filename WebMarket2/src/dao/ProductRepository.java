package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {

	private ArrayList<Product> list0fProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance(){
		return instance;
	}
	
	public ProductRepository() {
		Product phone = new Product("P1234", "iPhone 6s", 800000);
		phone.setDescription("4.7-inch, 1334X750 Renina HD display, 8-megapixel iSight Camera");
		phone.setCategory("Snart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		phone.setFilename("P1234.png");
	
		Product notebook = new Product("P1235", "LG PC �׷�",1500000);
		notebook.setDescription("13.3-inch, IPS LED display, 5rd GenerationIntel Core processors");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");
		notebook.setFilename("P1235.png");
		
		Product tablet = new Product("P1236", "Galaxy Tab S", 900000);
		tablet.setDescription("212.8*125.6*6.6mm, Super AMOLED display, Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		tablet.setFilename("p1236.png");
	
		list0fProducts.add(phone);
		list0fProducts.add(notebook);
		list0fProducts.add(tablet);
	}
		
		public ArrayList<Product> getAllProducts() {
			return list0fProducts;
		}
		
	public Product getProductById(String productid) {
			Product productById = null;
			
		for (int i = 0; i < list0fProducts.size(); i++) {
			Product product = list0fProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productid)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
		
	public void addProduct(Product product) {
		list0fProducts.add(product);
	}
	
}