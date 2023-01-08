package com.anil.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.boot.model.Product;
import com.anil.boot.repository.ProductRepository;

@Service
public class ProductServiceImp {

	@Autowired
	ProductRepository productRepository;

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}

	public Product findByName(String name) {
		return productRepository.findByName(name);
	}

	public Product findProducts() {
		return productRepository.findProducts();
	}

}
