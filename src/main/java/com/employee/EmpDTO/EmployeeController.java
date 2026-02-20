package com.employee.EmpDTO;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @Autowired
    private MapStruct mapStruct;

    @PostMapping("/emp")
    public String addEmployee(@Valid @RequestBody EmployeeDTO employeeDTO)
    {
        return employeeService.addEmployee(employeeDTO);
    }


    @GetMapping("/empmapstruct/{id}")
    public EmployeeDTO getEmployeeByIdMapStruct(@PathVariable Long id)
    {
        return employeeService.getEmployeeByIdMapStruct(id);
    }
}
