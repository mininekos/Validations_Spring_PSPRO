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
public class DniValidator implements ConstraintValidator<Dni, String>{

    @Override
    public boolean isValid(String dni, ConstraintValidatorContext cvc) {
        
        if(dni==null){
        return false;
        }
        if(dni.matches("[0-9]{7,8}[A-Z a-z]")){
            return true;
        }
        else {return false;}
    }
    
}
