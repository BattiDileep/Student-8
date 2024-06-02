package com.example.Student.Mapper;

import com.example.Student.DTO.EmployeeDTO;
import com.example.Student.Entity.Employee;
public class EmployeeMapper {		
		public static Employee mapToEmployee(EmployeeDTO empdto) {
			return new Employee(
					empdto.getEmployeeId(),
					empdto.getEmployeeName(),
					empdto.getEmployeeAddress(),
					empdto.getEmployeeMail());
		}
		public static EmployeeDTO mapToEmployeeDTO(Employee emp) {
			return new EmployeeDTO(
					emp.getEmployeeId(),
					emp.getEmployeeName(),
					emp.getEmployeeAddress(),
					emp.getEmployeeMail());
		}

	}



