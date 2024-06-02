package com.example.Student.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Student.DTO.EmployeeDTO;

import com.example.Student.Entity.Employee;

import com.example.Student.Exception.EmployeeNotFound;
import com.example.Student.Mapper.EmployeeMapper;

import com.example.Student.Repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
EmployeeRepo emprepo;

@Override
public EmployeeDTO createEmployee(EmployeeDTO empdto) {
	Employee emp=EmployeeMapper.mapToEmployee(empdto);
	Employee saveemp=emprepo.save(emp);
	return EmployeeMapper.mapToEmployeeDTO(saveemp);
	
}

@Override
public EmployeeDTO getEmployeeById(Long employeeId) {
	Employee emp=emprepo.findById(employeeId)
			.orElseThrow(() -> new EmployeeNotFound("employee not found :"+employeeId));
			return EmployeeMapper.mapToEmployeeDTO(emp);
}

@Override
public List<EmployeeDTO> getAllEMployees() {
	List<Employee> employees=emprepo.findAll();
	return employees.stream().map((n)->EmployeeMapper.mapToEmployeeDTO(n))
			.collect(Collectors.toList());
}

}





	


