package com.example.payroll.payroll_system.fiegnclient;

import com.example.payroll.payroll_system.dto.Project;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PROJECT-MANAGEMENT")
public interface ProjectFeignClient {

    @GetMapping("/projects/{id}")
    Project getProjectById(@PathVariable("id") Long id);
}