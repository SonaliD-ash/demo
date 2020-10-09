package com.employee.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.demo.EmployeeRepo;
import com.employee.demo.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo repo;
	
	public void add(Employee dto) {
		repo.save(dto);
	}
}
