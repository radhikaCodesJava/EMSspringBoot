package com.emp.demo.util;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.emp.demo.dtomodel.SkillDTO;
import com.emp.demo.entitymodel.Skill;


@Mapper(componentModel = "spring", uses=EmployeeMapper.class)
public interface SkillMapper {

SkillMapper INSTANCE = Mappers.getMapper(SkillMapper.class);

@Mapping(target="skillEmployeeId", source="skillEmpId.id")
	SkillDTO toSkillDTO(Skill savedEntity);
		
@InheritInverseConfiguration
		Skill toSkillEntity(SkillDTO skillDTO);
		 
	   	List<SkillDTO> toStateDTOList(List<Skill> skillEntities);
		 
		 List<Skill> toStateEntityList(List<SkillDTO> skillDTOs);
}
