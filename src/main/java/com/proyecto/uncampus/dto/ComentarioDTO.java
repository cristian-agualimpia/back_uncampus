package com.proyecto.uncampus.dto;

import jakarta.persistence.ManyToOne;


public class ComentarioDTO {

    private Long id;

    private String contenido;
    private Integer votosAFavor;
    private Integer votosEnContra;

    private java.time.LocalDateTime fecha;

    @ManyToOne
    private UsuarioDTO usuario; // El usuario que comentó

    @ManyToOne
    private LugarDTO lugar;     // El lugar al que se refiere

    // Getters y setters
}

