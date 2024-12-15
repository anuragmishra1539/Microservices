package com.example.project.project_management.repository;

import com.example.project.project_management.model.EmployeeAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeAssignmentRepository extends JpaRepository<EmployeeAssignment, Long> {
}
