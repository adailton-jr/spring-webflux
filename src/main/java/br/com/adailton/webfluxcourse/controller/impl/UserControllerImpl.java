package br.com.adailton.webfluxcourse.controller.impl;

import br.com.adailton.webfluxcourse.controller.UserController;
import br.com.adailton.webfluxcourse.model.request.UserRequest;
import br.com.adailton.webfluxcourse.model.response.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/users")
public class UserControllerImpl implements UserController {


    @Override
    public ResponseEntity<Mono<Void>> save(UserRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<Mono<UserResponse>> findOne(String id) {
        return null;
    }

    @Override
    public ResponseEntity<Flux<UserResponse>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Mono<UserResponse>> update(String id, UserRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<Mono<Void>> delete(String id) {
        return null;
    }
}
