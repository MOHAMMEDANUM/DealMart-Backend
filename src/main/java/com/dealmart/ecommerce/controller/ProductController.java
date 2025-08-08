package com.dealmart.ecommerce.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dealmart.ecommerce.model.Product;
import com.dealmart.ecommerce.service.ProductService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
    
    @GetMapping("/product")
    public ResponseEntity<?> findAllProduct() {
        return productService.findAllProduct();
    }
    
    @GetMapping("/product/{category}")
    public ResponseEntity<?> filterCategory(@PathVariable String category){
    	return productService.filterCategory(category);
    }
 
    @GetMapping("/product/name/{searchData}")
    public ResponseEntity<?> search(@PathVariable String searchData){
    	return productService.search(searchData);
    }
  
    
}