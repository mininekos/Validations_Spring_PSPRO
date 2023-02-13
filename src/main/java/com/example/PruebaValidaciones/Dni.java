package com.example.PruebaValidaciones;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;




@Documented
@Constraint(validatedBy = DniValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
public @interface Dni {
 
    String message() default "Dni incorrecto"; 
    Class<?>[] groups() default {};   
    Class<? extends Payload>[] payload() default {};
}