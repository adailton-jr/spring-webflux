package br.com.adailton.webfluxcourse.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequest(
        @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
        @NotBlank(message = "Name cannot be blank or null")
        String name,
        @Email(message = "invalid email")
        String email,
        @Size(min = 4, max = 16, message = "Name must be between 4 and 16 characters")
        @NotBlank(message = "Name cannot be blank or null")
        String password
) {
}
