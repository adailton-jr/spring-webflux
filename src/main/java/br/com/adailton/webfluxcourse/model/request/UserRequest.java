package br.com.adailton.webfluxcourse.model.request;

public record UserRequest(
        String name,
        String email,
        String password
) {
}
