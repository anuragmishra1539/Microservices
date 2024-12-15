package com.example.hr.hr_management.repository;

import com.example.hr.hr_management.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
