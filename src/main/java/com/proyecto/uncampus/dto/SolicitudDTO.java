package com.proyecto.uncampus.dto;


public class SolicitudDTO {
    private Long id;

    private java.time.LocalDateTime fecha;
    private String estado; // "PENDIENTE", "APROBADA", "RECHAZADA", etc.


    private LugarDTO lugarAsociado;

  
    private AdministradorDTO administrador;

    // Getters y setters
}
