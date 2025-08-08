package com.dealmart.ecommerce.model;

import jakarta.persistence.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private String category;
}
