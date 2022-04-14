package com.emp.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.emp.demo.dtomodel.EmployeeDTO;
import com.emp.demo.entitymodel.Employee;
import com.emp.demo.exception.DuplicateResourceFound;
import com.emp.demo.exception.ResourceNotFoundException;
import com.emp.demo.repository.EmployeeRepository;
import com.emp.demo.service.EmployeeService;
import com.emp.demo.util.EmployeeMapper;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository empRepo;
	@Autowired
	//@Qualifier("/target/generated-sources/annotations/com/emp/demo/util/EmployeeMapperImpl")
	EmployeeMapper empMapper;
	//get
	public List<EmployeeDTO> getAllEmployees()  throws ResourceNotFoundException
	{ 
		List<Employee> employeeEntityList= empRepo.findAll();  
	    return (empMapper.toEmployeeDTOList(employeeEntityList));
	  //return employeeEntityList;
	}
//create
	public EmployeeDTO createAndSaveEmployee(EmployeeDTO employee)throws DuplicateResourceFound
	{
		Employee newEmployee = empMapper.toEmployeeEntity(employee);
		  Employee savedEntity  = empRepo.save(newEmployee);
		 EmployeeDTO savedEmployeeDTO= empMapper.INSTANCE.toEmployeeDTO(savedEntity);
		 		return (savedEmployeeDTO);
		 }
	
	}

