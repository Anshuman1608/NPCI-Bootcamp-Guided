package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	public void save(Employee e);
	public Employee findById(Integer id);
	public void deleteById(Integer id);
}
