package com.proyecto.uncampus.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Double costo;
    private String disponibilidad; // Ej: "Lunes a Viernes, 7am - 7pm"
    private String horario;        // Campo adicional, si así lo deseas
    private String informacion;    // Descripción detallada

    @ManyToOne
    @JoinColumn(name = "comercio_id")
    private Comercio comercio;

    // Getters y setters
}

