package com.example.Student.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long>{

}
