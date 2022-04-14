package com.emp.demo.util;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.emp.demo.dtomodel.EmployeeDTO;
import com.emp.demo.entitymodel.Employee;

@Mapper(componentModel = "spring", implementationPackage = "com.emp.demo.util")
public interface EmployeeMapper {
	EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
	
	@Mapping(source="id", target="employeeId")
	EmployeeDTO toEmployeeDTO(Employee savedEntity);
		
		@InheritInverseConfiguration
		Employee toEmployeeEntity(EmployeeDTO empDTO);
		 
	   	List<EmployeeDTO> toEmployeeDTOList(List<Employee> Employees);
		 
		 List<Employee> toEmployeeEntityList(List<EmployeeDTO> EmployeeDtos);

}
