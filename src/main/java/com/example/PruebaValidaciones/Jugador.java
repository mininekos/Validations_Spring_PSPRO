/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PruebaValidaciones;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author minin
 */
@Getter
@Setter
@NoArgsConstructor
public class Jugador {
    
    @NotNull(message="Holi")
    @NotBlank(message="El nombre debe de estar relleno")
    @Size(min=3,max = 20, message="El nombre debe tener entre 3 y 20 caracteres")
    private String nombre;
    
    @NotNull(message="Holi")
    private int dorsal;
    
    @DateTimeFormat(pattern="dd/MM/yyyy")
    @NotNull @Past
    private LocalDate cumpleaños;

    @Dni
    private String dni;
    
    @NotNull
    @NotBlank(message="El email debe de estar relleno")
    @Email(message = "El email debe de ser correcto")
    private String email;
    
    @NotNull
    @Telefono
    private String tlf;
    
    @AssertTrue(message = "El jugador no esta disponible" , groups = InfoAdicional.class)
    private Boolean disponible;

    
    
}
