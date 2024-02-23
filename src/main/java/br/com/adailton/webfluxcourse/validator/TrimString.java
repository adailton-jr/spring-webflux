package br.com.adailton.webfluxcourse.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = {TrimStringValidator.class})
@Target(ElementType.FIELD)
@Retention(RUNTIME)
public @interface TrimString {

    String message() default "field cannot have blank spaces at the beginning and at the end";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
