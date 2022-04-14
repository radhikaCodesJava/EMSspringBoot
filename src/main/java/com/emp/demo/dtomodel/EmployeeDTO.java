package com.emp.demo.dtomodel;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDTO {

private long EmployeeId;

private String firstName;
	
private String lastName;
	
private String emailId;
}
