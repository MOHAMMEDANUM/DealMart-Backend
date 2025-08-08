package com.dealmart.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dealmart.ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	

	@Query("select p from Product p where p.category like ?1")
	List<Product> filterCategory(String category);

//	@Query("select p from Product p where p.name like ?1")
	@Query("SELECT p FROM Product p WHERE LOWER(p.name) LIKE LOWER(CONCAT('%', :searchData, '%'))")
	List<Product> search(String searchData);
	

	}
