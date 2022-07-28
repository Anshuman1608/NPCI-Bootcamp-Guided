package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	@GetMapping("/list")
	public String findAll(Model model){
		List<Employee> emp = empService.findAll();
		model.addAttribute("EMPLOYEE",emp);
		return "empUI/employees.html";
	}
	
	@GetMapping("/addEmp")
	public String empForm(Model model) {
		model.addAttribute("EMPLOYEE",new Employee());
		return "empUI/employeeForm.html";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("EMPLOYEE") Employee emp)
	{
		empService.save(emp);
		return "redirect:/employee/list";
	}
}
