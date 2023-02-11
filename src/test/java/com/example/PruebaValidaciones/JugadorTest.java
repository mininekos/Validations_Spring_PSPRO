/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.example.PruebaValidaciones;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.time.LocalDate;
import java.util.Set;
import org.hibernate.validator.internal.util.logging.Log_$logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author minin
 */
public class JugadorTest {
    
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    Validator validator =  factory.getValidator();
    
    @Test
    public void pruebaValidator() {
        Jugador jugador = crearJuagadorCorrecto();

        Set<ConstraintViolation<Jugador>> violations = validator.validate(jugador);
        
        for (ConstraintViolation<Jugador> violation : violations) {
            System.err.println(violation.getMessage());
        }
        
    }
    
    
    private Jugador crearJugador(){
    
        return new Jugador();
    }
    
    private Jugador crearJuagadorCorrecto(){
    
        Jugador jugador= new Jugador();
        jugador.setTlf("956303515");
        jugador.setNombre("aas");
        jugador.setDni("32097176d");
        jugador.setDorsal(15);
        jugador.setEmail("manu@manu.com");
        jugador.setCumpleaños(LocalDate.of(1997, 2, 22));
        return jugador;
    }
}
