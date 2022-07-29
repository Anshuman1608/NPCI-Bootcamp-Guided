package com.practice.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.shop.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	public List<Product> findBynameContainsAllIgnoreCase(String name);
	public List<Product> findBycategoryid(Integer categoryid);
}
