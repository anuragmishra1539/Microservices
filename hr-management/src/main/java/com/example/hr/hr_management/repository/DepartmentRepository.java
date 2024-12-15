package com.example.hr.hr_management.repository;

import com.example.hr.hr_management.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
