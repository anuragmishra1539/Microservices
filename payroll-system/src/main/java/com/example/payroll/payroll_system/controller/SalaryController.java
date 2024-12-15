package com.example.payroll.payroll_system.controller;


import com.example.payroll.payroll_system.dto.Project;
import com.example.payroll.payroll_system.exception.ResourceNotFoundException;
import com.example.payroll.payroll_system.fiegnclient.ProjectFeignClient;
import com.example.payroll.payroll_system.model.Salary;
import com.example.payroll.payroll_system.repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/salaries")
public class SalaryController {

    @Autowired
    private SalaryRepository salaryRepository;

    @Autowired
    private ProjectFeignClient projectFeignClient;

    @GetMapping
    public List<Salary> getAllSalaries() {
        return salaryRepository.findAll();
    }

    @PostMapping
    public Salary createSalary(@RequestBody Salary salary) {
        return salaryRepository.save(salary);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Salary> updateSalary(@PathVariable Long id, @RequestBody Salary salaryDetails) {
        Salary salary = salaryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Salary not found"));

        salary.setBaseSalary(salaryDetails.getBaseSalary());
        salary.setBonus(salaryDetails.getBonus());
        salary.setDeductions(salaryDetails.getDeductions());

        final Salary updatedSalary = salaryRepository.save(salary);
        return ResponseEntity.ok(updatedSalary);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteSalary(@PathVariable Long id) {
        Salary salary = salaryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Salary not found"));

        salaryRepository.delete(salary);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    @GetMapping("project/{id}")
    public Project getProjectById(@PathVariable Long id) {
        return projectFeignClient.getProjectById(id);
    }

}
