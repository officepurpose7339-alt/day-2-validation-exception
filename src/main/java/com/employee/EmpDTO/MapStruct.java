package com.employee.EmpDTO;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Mapper(componentModel = "spring")
public interface MapStruct {

    EmployeeDTO toDto(Employee employee);
    Employee toEntity(EmployeeDTO employeeDTO);
}
