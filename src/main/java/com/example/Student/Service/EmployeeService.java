package com.example.Student.Service;

import java.util.List;

import com.example.Student.DTO.EmployeeDTO;
import com.example.Student.Entity.Employee;

public interface EmployeeService {
	public EmployeeDTO createEmployee(EmployeeDTO emodto);

	public EmployeeDTO getEmployeeById(Long employeeId);
	
	public List<EmployeeDTO> getAllEMployees();

	public EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO empdto);
	

}
