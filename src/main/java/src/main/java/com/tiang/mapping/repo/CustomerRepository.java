package src.main.java.com.tiang.mapping.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import src.main.java.com.tiang.mapping.dto.OrderResponse;
import src.main.java.com.tiang.mapping.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	
	//@Query("SELECT c.name ,p.productName from Customer c JOIN c.product p")
	 //public String[] getJoinInformation();
	//map by OrderResponse construct
	@Query("SELECT new src.main.java.com.tiang.mapping.dto.OrderResponse( c.name ,p.productName) from Customer c JOIN c.product p")
	public List<OrderResponse> getJoinInformation();

}
