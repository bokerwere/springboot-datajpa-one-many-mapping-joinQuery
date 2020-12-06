package src.main.java.com.tiang.mapping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product {
	@Id
private int pid;
private String productName;
private int price;
private int qty;

public int getPid() {
	return pid;
}

public Product() {
	
	// TODO Auto-generated constructor stub
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getQty() {
	return qty;
}

public void setQty(int qty) {
	this.qty = qty;
}

public Product(int pid, String productName, int price, int qty) {
	super();
	this.pid = pid;
	this.productName = productName;
	this.price = price;
	this.qty = qty;
}

@Override
public String toString() {
	return "Product [pid=" + pid + ", productName=" + productName + ", price=" + price + ", qty=" + qty + "]";
}




}
