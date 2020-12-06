package src.main.java.com.tiang.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import src.main.java.com.tiang.mapping.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
