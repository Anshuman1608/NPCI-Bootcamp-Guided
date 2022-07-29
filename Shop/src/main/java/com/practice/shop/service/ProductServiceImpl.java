package com.practice.shop.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.shop.entity.Product;
import com.practice.shop.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productrepo;
	

	public List<Product> findAll() {
		return productrepo.findAll();
	}

	@Transactional
	public void save(Product p) {
		productrepo.save(p);
		
	}

	@Transactional
	public Product findById(Integer id) {
		Optional<Product> e = productrepo.findById(id);
		Product pro = null;
		if(e.isPresent())
			pro = e.get();
		return pro;
	} 

	@Transactional
	public void deleteById(Integer id) {
		productrepo.deleteById(id);
	}

	@Override
	public List<Product> searchBy(String name) {
		List<Product> results = null;
		if(name != null && (name.trim().length()>0))
			results = productrepo.findBynameContainsAllIgnoreCase(name);
		else
			results = findAll();
		return results;
	}

	@Override
	public List<Product> searchByCategoryid(Integer categoryid) {
		List<Product> results = null;
		if(categoryid != 0 && categoryid > 0)
			results = productrepo.findBycategoryid(categoryid);
		else
			results = findAll();
		return results;
	}

}
