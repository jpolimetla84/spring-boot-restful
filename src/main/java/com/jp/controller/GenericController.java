package com.jp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface GenericController<T> {

	public ResponseEntity<?> create(@RequestBody T t);

	public ResponseEntity<?> get(@PathVariable Integer id);

	public ResponseEntity<?> getAll();

	public ResponseEntity<?> update(@RequestBody T t);

	public void delete(@PathVariable Integer id);

}
