package com.emp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emp.demo.dtomodel.EmployeeDTO;
import com.emp.demo.entitymodel.Employee;
import com.emp.demo.exception.DuplicateResourceFound;
import com.emp.demo.exception.ResourceNotFoundException;
import com.emp.demo.repository.EmployeeRepository;
import com.emp.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	//@Qualifier("com.emp.demo.serviceImpl.EmployeeServiceImpl")
	EmployeeService empService;
	
	//@Autowired
	//EmployeeRepository empRepo;
	
 //get All employees
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/employees")
	public ResponseEntity<?> getAllEmployees()	{
		System.out.println("in get all employees");
	List<EmployeeDTO> employeeList = empService.getAllEmployees();
		//List<Employee> employeeList = empService.getAllEmployees();
		//List<Employee> employeeList =empRepo.findAll();
		return ResponseEntity.ok(employeeList);  
	}
	
	//create employee restAPI
	@PostMapping("/employees")
	public ResponseEntity<?> createEmployee(@RequestBody EmployeeDTO emp) throws DuplicateResourceFound {
		System.out.println("in create employee controller");
		EmployeeDTO savedEmployeeDTO = empService.createAndSaveEmployee(emp);
	
		return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployeeDTO);  
	}
	
	//getEmployeeByIdRestAPI
	@GetMapping("/employees/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable Long id)throws ResourceNotFoundException{
		System.out.println("in get employeeByID");
		EmployeeDTO resEmployee= empService.getEmployeeById(id);
		return ResponseEntity.ok(resEmployee);
	}
	
	//updateEmployeeRestAPI
	@PutMapping("/employees/{id}")
	public ResponseEntity<?> updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO emp) throws ResourceNotFoundException
	{
	System.out.println("in update Employee by Id");
	EmployeeDTO  updatedEmployee= empService.updateEmployeeById(id, emp);
	return ResponseEntity.ok(updatedEmployee);
	}
	
}
