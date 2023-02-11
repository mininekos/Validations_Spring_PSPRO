/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PruebaValidaciones;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 *
 * @author minin
 */
public class TelefonoValidator implements ConstraintValidator<Telefono, String>{

    @Override
    public boolean isValid(String telefono, ConstraintValidatorContext cvc) {
    
        //Validacion 9 numeros
        if(telefono.matches("([+]34)?\\d{9}")) return true;
        //Validacion 9 numeros con espacio cada 3
        else if(telefono.matches("([+]34)?\\d{3}[\\s]\\d{3}[\\s]\\d{3}")) return true;
        //Validacion 9 numeros con espacio de 3-2-2-2
        else if(telefono.matches("([+]34)?\\d{3}[\\s]\\d{2}[\\s]\\d{2}[\\s]\\d{2}")) return true;
        else return false;
    }
    
}
