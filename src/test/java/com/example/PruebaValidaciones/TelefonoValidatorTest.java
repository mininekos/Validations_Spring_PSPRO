/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.example.PruebaValidaciones;

import jakarta.validation.ConstraintValidatorContext;
import org.junit.jupiter.api.Test;


/**
 *
 * @author minin
 */
public class TelefonoValidatorTest {
    
    @Test
    void telefonoFalse() throws Exception {

        TelefonoValidator telefono = new TelefonoValidator();
        Boolean isValid = telefono.isValid("habia una vez", null);
        assert !isValid;
    }
    
    @Test
    void telefonoCompletoTrue() throws Exception {

        TelefonoValidator telefono = new TelefonoValidator();
        Boolean isValid = telefono.isValid("956303515", null);
        assert isValid;
    }
    
    @Test
    void telefonoEspaciosTrue() throws Exception {

        TelefonoValidator telefono = new TelefonoValidator();
        Boolean isValid = telefono.isValid("956 303 515", null);
        assert isValid;
    }
    
    @Test
    void telefonoEspaciosTrue_V2() throws Exception {

        TelefonoValidator telefono = new TelefonoValidator();
        Boolean isValid = telefono.isValid("956 30 35 15", null);
        assert isValid;
    }
    
}
