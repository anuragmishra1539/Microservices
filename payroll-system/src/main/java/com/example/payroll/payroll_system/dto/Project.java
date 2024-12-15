package com.example.payroll.payroll_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Project {

    private Long id;
    private String projectName;
    private LocalDate startDate;
    private LocalDate endDate;

    // Getters and Setters
}
