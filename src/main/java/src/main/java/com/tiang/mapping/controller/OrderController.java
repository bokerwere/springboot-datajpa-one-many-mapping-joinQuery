package src.main.java.com.tiang.mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import src.main.java.com.tiang.mapping.dto.OrderRequest;
import src.main.java.com.tiang.mapping.dto.OrderResponse;
import src.main.java.com.tiang.mapping.entity.Customer;
import src.main.java.com.tiang.mapping.repo.CustomerRepository;
import src.main.java.com.tiang.mapping.repo.ProductRepository;

@RestController
public class OrderController {
	@Autowired
	private CustomerRepository  customerRepository;
	@Autowired
	 private ProductRepository productRepository;
	@PostMapping("/placeOrder")
    public Customer  placeOrder(@RequestBody OrderRequest request) {
    	return customerRepository.save(request.getCustomer());
    	
    }
@GetMapping("/getAll")	
public List<Customer> findAll(){
	 return this.customerRepository.findAll();
	
}

//@GetMapping("/getInfo")
//public String[] getInfo() {
	//return  customerRepository.getJoinInformation();
	
//}

@GetMapping("/getInfo")
public  List<OrderResponse> getInfo() {
	return  customerRepository.getJoinInformation();
	
}
}
