package br.com.adailton.webfluxcourse.service;

import br.com.adailton.webfluxcourse.entity.User;
import br.com.adailton.webfluxcourse.mapper.UserMapper;
import br.com.adailton.webfluxcourse.model.request.UserRequest;
import br.com.adailton.webfluxcourse.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    public Mono<User> save(final UserRequest request) {
        return repository.save(mapper.toEntity(request));
    }

    public Mono<User> findById(final String id) {
        return repository.findById(id);
    }
}
