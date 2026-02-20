package com.employee.EmpDTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class EmployeeDTO {
    @NotBlank(message = "Name cannot  be empty")
    String name;
    @NotBlank(message = "Role cannot be empty")
    String role;
    @Email(message = "Mail ID format is incorrect")
    String email;
}
