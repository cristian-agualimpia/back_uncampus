package com.proyecto.uncampus.dto;

public class ServicioDTO {
   
    private Long id;

    private String nombre;
    private Double costo;
    private String disponibilidad; // Ej: "Lunes a Viernes, 7am - 7pm"
    private String horario;        // Campo adicional, si así lo deseas
    private String informacion;    // Descripción detallada


    private ComercioDTO comercio;

    // Getters y setters
}

