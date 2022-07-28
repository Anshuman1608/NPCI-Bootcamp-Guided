package com.example.demo.service;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> findAll() {
		
		return repository.findAll();
	}
	
	@Transactional
	public void save(Employee e) {
		repository.save(e);
		
	}

	@Transactional
	public Employee findById(Integer id) {
		Optional<Employee> p = repository.findById(id);
		Employee emp = null;
		if(p.isPresent())
			emp = p.get(); 
		return emp;
	}

	@Transactional
	public void deleteById(Integer id) {
		repository.deleteById(id);
		
	}

}
