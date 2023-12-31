package com.kujproject.kuj.validation.user;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UserDupCheckValidator.IdDupCheck.class)
public @interface IdDupCheckValidator {
    String message() default "이미 사용 중인 ID입니다.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
