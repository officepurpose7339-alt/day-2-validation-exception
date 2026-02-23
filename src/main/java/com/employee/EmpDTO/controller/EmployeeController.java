package com.employee.EmpDTO.controller;

import com.employee.EmpDTO.service.EmployeeService;
import com.employee.EmpDTO.exchange.request.EmployeeRequestDTO;
import com.employee.EmpDTO.exchange.response.EmployeeResponseDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/emp")
    public String addEmployee(@Valid @RequestBody EmployeeRequestDTO employeeRequestDTO)
    {
        return employeeService.addEmployee(employeeRequestDTO);
    }

    @GetMapping("/empmapstruct/{id}")
    public EmployeeResponseDTO getEmployeeByIdMapStruct(@PathVariable Long id)
    {
        return employeeService.getEmployeeByIdMapStruct(id);
    }
}
