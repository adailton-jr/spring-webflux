package br.com.adailton.webfluxcourse.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document//sustitui o @Entity
public class User {

    @Id
    private String userId;
    private String name;

    @Indexed(unique = true) //por padrão o unique é false;
    private String email;
    private String password;
}
