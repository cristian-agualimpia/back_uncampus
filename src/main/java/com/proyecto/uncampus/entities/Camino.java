package com.proyecto.uncampus.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Camino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "origen_id")
    private Lugar origen;

    @ManyToOne
    @JoinColumn(name = "destino_id")
    private Lugar destino;

    private Double distancia; // Distancia en metros, o la métrica que uses

    // Getters y setters
}

