package com.employee.EmpDTO;

import com.employee.EmpDTO.Exceptions.EmployeeNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    private MapStruct mapStruct;

    public String addEmployee(EmployeeDTO employeeDTO)
    {
        Employee employee1= mapStruct.toEntity(employeeDTO);
        employeeRepository.save(employee1);
        return "Success";
    }

    public EmployeeDTO getEmployeeByIdMapStruct(Long id)
    {
        Employee employee= employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));
        EmployeeDTO employeeDTO = mapStruct.toDto(employee);
        return employeeDTO;
    }



}
