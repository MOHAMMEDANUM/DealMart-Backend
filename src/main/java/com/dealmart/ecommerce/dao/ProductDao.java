package com.dealmart.ecommerce.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dealmart.ecommerce.model.Product;
import com.dealmart.ecommerce.repository.ProductRepository;

@Repository
public class ProductDao {
	
	@Autowired
	ProductRepository productRepository;

	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}

	public List<Product> filterCategory(String category) {
		return productRepository.filterCategory(category);
	}

	public List<Product> search(String searchData) {
		return productRepository.search(searchData);	}
	}
