package br.com.adailton.webfluxcourse.model.response;

public record UserResponse(
        String userId,
        String name,
        String email,
        String password
) {
}
