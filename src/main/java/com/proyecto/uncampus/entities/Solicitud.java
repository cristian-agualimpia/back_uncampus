package com.proyecto.uncampus.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private java.time.LocalDateTime fecha;
    private String estado; // "PENDIENTE", "APROBADA", "RECHAZADA", etc.

    @ManyToOne
    private Lugar lugarAsociado;

    @ManyToOne
    private Administrador administrador;

    // Getters y setters
}
