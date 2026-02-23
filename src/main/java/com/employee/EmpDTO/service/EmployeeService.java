package com.employee.EmpDTO.service;

import com.employee.EmpDTO.repository.EmployeeRepository;
import com.employee.EmpDTO.Exceptions.EmployeeNotFoundException;
import com.employee.EmpDTO.mapper.MapStruct;
import com.employee.EmpDTO.exchange.request.EmployeeRequestDTO;
import com.employee.EmpDTO.exchange.response.EmployeeResponseDTO;
import com.employee.EmpDTO.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    private MapStruct mapStruct;

    public String addEmployee(EmployeeRequestDTO employeeRequestDTO)
    {
        Employee employee1= mapStruct.toEntity(employeeRequestDTO);
        employeeRepository.save(employee1);
        return "Success";
    }

    public EmployeeResponseDTO getEmployeeByIdMapStruct(Long id)
    {
        Employee employee= employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));
        EmployeeResponseDTO employeeResponseDTO = mapStruct.toDto(employee);
        return employeeResponseDTO;
    }



}
