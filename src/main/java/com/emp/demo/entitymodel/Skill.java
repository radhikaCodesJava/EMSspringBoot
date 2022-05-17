package com.emp.demo.entitymodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name="skills")
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="skill_id")
	private long skillId;
	
	@Column(name="skill_name")
	private String skillName;
	
	//@Column(name="skill_employee_id")
	//private long skill_employeeId;
	
	@ManyToOne//(fetch= FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="skill_employee_id", nullable=false)
	//@JsonIgnore
	@javax.persistence.Embedded
	private Employee skillEmpId;
}
