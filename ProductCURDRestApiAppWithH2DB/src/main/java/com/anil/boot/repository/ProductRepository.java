package com.anil.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anil.boot.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	public Product findByName(String name);
	
	@Query(value =  "select * from Product where id=3", nativeQuery = true)
	public Product findProducts();

}
