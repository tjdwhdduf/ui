package dto;

import java.io.Serializable;

public class Product implements Serializable{
	
	private static final long serialVersionUID = -4274700572038677000L;
	
	private String productId;  		//상품 아이디
	private String pname;			//상품명
	private Integer unitPrice;		//상품 가격
	private String description;		//상품 설명
	private String manufacturer;	//제조사
	private String caregory;		//분류
	private long unitsInStock;		//재고 수
	private String condition;		//신상품 or 중고품 or 재생품
}
	public Product() {
		super();
	}
	
	public Product(String productId, String pname, Integer unitPrice) {
		this.productId = productId;
		this.pname = pname;
		this.unitPrice = unitPrice;
	}
}
	public String getPname(String pname) {
		this.pname = pname;
	}
	
	public void setProductId = productId;
	}
	
	public Integer getunitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(Integer unitPrice) {
		this.unitPeice = unitPrice;
	}
	
	public String getDescription() {
		return description;
	}
public void setDescription(string description) {
	this.description = description;
}

public String getManufacturer() {
	return manufacturer;
}

public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.Category = category;
}	

public long getUnitsInStock() {
	return unitsInStock;
}

public void setUnitsInStock(long unitsInStock) {
	this.unitsInStock = unitsInStock;
}

public String getCondition() {
	return condition;
}

public void setCondition(String condition) {
	this.condition = condition;
}
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}