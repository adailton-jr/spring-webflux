package br.com.adailton.webfluxcourse.model.request;

import br.com.adailton.webfluxcourse.validator.TrimString;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequest(
        @TrimString
        @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
        @NotBlank(message = "Name cannot be blank or null")
        String name,
        @TrimString
        @Email(message = "invalid email")
        @NotBlank(message = "Email cannot be blank or null")
        String email,
        @TrimString
        @Size(min = 4, max = 16, message = "Password must be between 4 and 16 characters")
        @NotBlank(message = "Password cannot be blank or null")
        String password
) {
}
