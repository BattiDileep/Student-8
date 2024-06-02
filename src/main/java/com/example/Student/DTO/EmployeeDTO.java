package com.example.Student.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDTO {
	
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private String employeeMail;


}
