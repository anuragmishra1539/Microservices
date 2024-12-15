package com.example.payroll.payroll_system.repository;

import com.example.payroll.payroll_system.model.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<Salary, Long> {
}
