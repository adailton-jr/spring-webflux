package br.com.adailton.webfluxcourse.controller.exceptions;

import com.mongodb.DuplicateKeyException;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import reactor.core.publisher.Mono;

import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.BAD_REQUEST;


@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(DuplicateKeyException.class)
    ResponseEntity<Mono<StandardError>> duplicateKeyException(
            DuplicateKeyException ex, ServerHttpRequest request
    ) {
        return ResponseEntity.badRequest()
                .body(Mono.just(
                        StandardError.builder()
                                .timestamp(now())
                                .status(BAD_REQUEST.value())
                                .error(BAD_REQUEST.getReasonPhrase())
                                .path(request.getURI().getPath())
                                .message(verifyDupKey(ex.getMessage()))
                                .build()
                ));
    }

    private String verifyDupKey(String message) {
        if (message.contains("email dup key")) {
            return "Email ja existe";
        }
        return "Duplicated Key Exception";
    }
}

