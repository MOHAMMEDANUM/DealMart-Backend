package com.dealmart.ecommerce.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dealmart.ecommerce.dao.ProductDao;
import com.dealmart.ecommerce.model.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductDao productDao;

	public ResponseEntity<?> addProduct(Product product) {
		Product saveProduct = productDao.addProduct(product);
		return ResponseEntity.status(201).body("Products are :- \n \n "+saveProduct);
	}

	public ResponseEntity<?> findAllProduct() {
		List<Product> products=productDao.findAllProduct();
		if(products.isEmpty()) {
			return ResponseEntity.status(404).body("Unable to fetch");
		}
		else {
			return ResponseEntity.status(200).body(products);
		}
	}

	public ResponseEntity<?> filterCategory(String category) {
		List<Product> categories=productDao.filterCategory(category);
		if(categories.isEmpty()) {
			return ResponseEntity.status(404).body("Unable to fetch");
		}
		else {
			return ResponseEntity.status(200).body(categories);
		}
	}

	public ResponseEntity<?> search(String searchData) {
		List<Product> searchDatas=productDao.search(searchData);
		if(searchDatas.isEmpty()) {
			return ResponseEntity.status(404).body("Unable to fetch");
		}
		else {
			return ResponseEntity.status(200).body(searchDatas);
		}
	}
	
}
