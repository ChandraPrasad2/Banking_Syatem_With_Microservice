package com.chandra.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold customer and account details"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer",example = "Chandra Bhushan"
    )
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 5, max = 30, message = "Name should be between 5 and 30 characters")
    private String name;
    
    @Schema(
            description = "Email of the customer",example = "sFt2R@example.com"
    )
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Invalid email format")
    private String email;
    
    @Schema(
            description = "Mobile number of the customer",example = "1234567890"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number should be 10 digits")
    private String mobileNumber;
    
    @Schema(
            description = "Account details of the customer"
    )
    private AccountsDto accountsDto;
}
