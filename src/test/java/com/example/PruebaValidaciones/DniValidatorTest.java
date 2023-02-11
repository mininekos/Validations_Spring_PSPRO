/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.example.PruebaValidaciones;


import org.junit.jupiter.api.Test;

/**
 *
 * @author minin
 */
public class DniValidatorTest {
    
   @Test
    void dniFalse() throws Exception {

        DniValidator dni = new DniValidator();
        Boolean isValid = dni.isValid("habia una vez", null);
        assert !isValid;
    }
    
    @Test
    void dniNull() throws Exception {

        DniValidator dni = new DniValidator();
        Boolean isValid = dni.isValid(null, null);
        assert !isValid;
    }
    
    @Test
    void dniTrue() throws Exception {

        DniValidator dni = new DniValidator();
        Boolean isValid = dni.isValid("12345678A", null);
        assert isValid;
    }
    
}
