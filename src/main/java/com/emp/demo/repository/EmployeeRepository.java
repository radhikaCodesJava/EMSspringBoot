package com.emp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.demo.entitymodel.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
