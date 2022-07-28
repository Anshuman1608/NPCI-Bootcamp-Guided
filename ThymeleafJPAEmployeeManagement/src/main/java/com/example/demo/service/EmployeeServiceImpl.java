package com.example.demo.service;

import java.util.List;

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

}
