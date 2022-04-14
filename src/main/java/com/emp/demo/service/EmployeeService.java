package com.emp.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.demo.dtomodel.EmployeeDTO;
import com.emp.demo.entitymodel.Employee;
import com.emp.demo.exception.DuplicateResourceFound;
import com.emp.demo.exception.ResourceNotFoundException;

public interface EmployeeService {
    //get employee
	public List<EmployeeDTO> getAllEmployees() throws ResourceNotFoundException;
	//public List<Employee> getAllEmployees() throws ResourceNotFoundException;
	//create employee
	public EmployeeDTO createAndSaveEmployee(EmployeeDTO employee)throws DuplicateResourceFound;
}
