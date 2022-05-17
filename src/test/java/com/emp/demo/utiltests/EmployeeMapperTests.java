package com.emp.demo.utiltests;

import static org.assertj.core.api.Assertions.assertThat;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import com.emp.demo.entitymodel.Employee;
import com.emp.demo.dtomodel.EmployeeDTO;
import com.emp.demo.util.EmployeeMapper;

public class EmployeeMapperTests {
	@Test
	public void shouldMapEmployeeToDto() {
			//LocalDateTime now= LocalDateTime.now();
			//Timestamp timestamp= Timestamp.valueOf(now);
		   //given
		    Employee emp = new Employee(20,"Supriya","Nisura","supriya@gmail.com");
		    
		   //when
		    EmployeeDTO EmpDto = EmployeeMapper.INSTANCE.toEmployeeDTO( emp );
		 
		   //then
		    assertThat( EmpDto ).isNotNull();
		    assertThat( EmpDto.getFirstName()).isEqualTo( "Supriya" );
		    assertThat( EmpDto.getLastName() ).isEqualTo( "Nisura" );
		    
		}
	}



