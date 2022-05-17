package com.emp.demo.dtomodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class SkillDTO {

	private long skillId;
	
	
	private String skillName;
	
	
	private long skillEmployeeId;
}
