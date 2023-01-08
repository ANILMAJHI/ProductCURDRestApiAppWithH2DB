package com.anil.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anil.boot.model.Product;
import com.anil.boot.service.ProductServiceImp;

@RestController
@RequestMapping("/api")
public final class ProductController {

	@Autowired
	ProductServiceImp service;

	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	@GetMapping("/allProducts")
	public List<Product> getAllProducts() {
		return service.findAllProducts();
	}

	@GetMapping("/findByName/{name}")
	public Product getProductByName(@PathVariable String name) {
		return service.findByName(name);
	}

	@GetMapping("/getProduct")
	public Product getProduct() {
		return service.findProducts();
	}

}
