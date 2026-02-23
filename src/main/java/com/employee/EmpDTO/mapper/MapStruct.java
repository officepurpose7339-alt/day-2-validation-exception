package com.employee.EmpDTO.mapper;

import com.employee.EmpDTO.exchange.request.EmployeeRequestDTO;
import com.employee.EmpDTO.exchange.response.EmployeeResponseDTO;
import com.employee.EmpDTO.model.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStruct {

    EmployeeResponseDTO toDto(Employee employee);
    Employee toEntity(EmployeeRequestDTO employeeRequestDTO);

}
