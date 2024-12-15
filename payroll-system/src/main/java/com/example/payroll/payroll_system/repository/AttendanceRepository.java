package com.example.payroll.payroll_system.repository;


import com.example.payroll.payroll_system.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}
