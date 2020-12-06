package src.main.java.com.tiang.mapping.dto;

import src.main.java.com.tiang.mapping.entity.Customer;

public class OrderRequest {
 private Customer customer;
 
 public OrderRequest() {
	 
 }

public OrderRequest(Customer customer) {
	super();
	this.customer = customer;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

@Override
public String toString() {
	return "OrderRequest [customer=" + customer + "]";
}
 
}
