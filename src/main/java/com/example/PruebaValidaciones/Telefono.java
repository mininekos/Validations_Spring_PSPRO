/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/AnnotationType.java to edit this template
 */
package com.example.PruebaValidaciones;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author minin
 */

/*
@NotNull
@Pattern(regexp = "[0-9]*", message = "Solo valen numeros")
@Length(min = 9, max = 14, message = "debe de estar entre 9 y 14 numeros")
*/

@Constraint(validatedBy=TelefonoValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target( { ElementType.METHOD, ElementType.FIELD ,ElementType.PARAMETER })
//@ConstraintComposition(CompositionType.OR)
public @interface Telefono {
    
    String message() default "{telefono incorrecto}";
     
    Class<?>[] groups() default {};
    
    Class<? extends Payload>[] payload() default {};
}
