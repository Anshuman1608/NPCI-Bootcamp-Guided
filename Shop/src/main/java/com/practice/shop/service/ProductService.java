package com.practice.shop.service;

import java.util.List;

import com.practice.shop.entity.Product;

public interface ProductService {
	public List<Product> findAll();
	public void save(Product p);
	public Product findById(Integer id);
	public void deleteById(Integer id);
	public List<Product> searchBy(String name);
	public List<Product> searchByCategoryid(Integer categoryid);
}
