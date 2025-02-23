package com.proyecto.uncampus.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contenido;
    private Integer votosAFavor;
    private Integer votosEnContra;

    private java.time.LocalDateTime fecha;

    @ManyToOne
    private Usuario usuario; // El usuario que comentó

    @ManyToOne
    private Lugar lugar;     // El lugar al que se refiere

    // Getters y setters
}

