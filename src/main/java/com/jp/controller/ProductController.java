package com.jp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jp.model.Product;
import com.jp.service.ProductServiceImpl;

@RestController
@RequestMapping("/products")
public class ProductController implements GenericController<Product> {

	private final ProductServiceImpl productService;

	public ProductController(ProductServiceImpl productService) {
		super();
		this.productService = productService;
	}

	@PostMapping
	@Override
	public ResponseEntity<?> create(@RequestBody Product product) {
		return new ResponseEntity<>(productService.create(product), HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	@Override
	public ResponseEntity<?> get(@PathVariable Integer id) {
		return ResponseEntity.ok(productService.get(id));
	}

	@Override
	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok(productService.getAll());
	}

	@Override
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Product product) {
		return ResponseEntity.ok(productService.create(product));
	}

	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	@Override
	public void delete(@PathVariable Integer id) {
		productService.delete(id);
	}

}
