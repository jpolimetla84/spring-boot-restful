package com.jp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jp.model.Product;
import com.jp.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements GenericSevice<Product> {

	private final ProductRepository productRepository;

	@Override
	public Product create(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product get(Integer id) {
		return productRepository.findById(id).get();
	}

	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	@Override
	public Product update(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void delete(Integer id) {
		productRepository.deleteById(id);
	}

}
