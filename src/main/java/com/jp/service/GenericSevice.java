package com.jp.service;

import java.util.List;

public interface GenericSevice<T> {

	public T create(T product);

	public T get(Integer id);

	public List<T> getAll();

	public T update(T product);

	public void delete(Integer id);

}
