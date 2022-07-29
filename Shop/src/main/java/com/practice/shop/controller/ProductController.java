package com.practice.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.practice.shop.entity.Product;
import com.practice.shop.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService prodservice;
	
	@GetMapping("/list")
	public String prodListView(Model model)
	{
		List<Product> product = prodservice.findAll();
		model.addAttribute("PRODUCT",product);
		return "productUI/productlist.html";
	}
	
	@GetMapping("/addPro")
	public String productForm(Model model)
	{
		model.addAttribute("PRODUCT",new Product());
		return "productUI/ProductForm.html";
	}
	@PostMapping("/save")
	public String save(@ModelAttribute("PRODUCT")Product product) {
		prodservice.save(product);
		return "redirect:/product/list";
	}
	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("proId")Integer id, Model model)
	{
			Product pro = prodservice.findById(id);
			model.addAttribute("PRODUCT", pro);
			return "productUI/ProductForm.html";
		
	}
	
	@GetMapping("/deleteForm")
	public String deleteById(@RequestParam("proId")Integer id)
	{
		prodservice.deleteById(id);
		return "redirect:/product/list";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("productName")String name, Model model) {
		List<Product> products = prodservice.searchBy(name);
		model.addAttribute("PRODUCT",products);
		return "productUI/productlist.html";
	}
	@GetMapping("/searchByCategory")
	public String searchByCategory(@RequestParam("categoryid")Integer id, Model model)
	{
		List<Product> products = prodservice.searchByCategoryid(id);
		model.addAttribute("PRODUCT",products);
		return "productUI/productlist.html";
	}
	
	
	

}
