package com.employee.EmpDTO.exchange.response;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmployeeResponseDTO {
    String name;
    String role;
    String email;
}
