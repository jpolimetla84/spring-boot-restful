package com.jp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
