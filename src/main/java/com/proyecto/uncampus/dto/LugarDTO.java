package com.proyecto.uncampus.dto;

import java.util.ArrayList;
import java.util.List;

public abstract class LugarDTO {


    private Long id;

    private String nombre;

    private UsuarioDTO guia;  

    // Aprobación: si ya fue validado por un admin
    private boolean aprobado;

    // Horario general (ej. "Lunes-Viernes, 8am - 6pm")
    private String horario;

    // Novedades: (cerrado, en mantenimiento, etc.)
    private String novedades;

    // Comentarios asociados
    private List<ComentarioDTO> comentarios = new ArrayList<>();

    // Getters y setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public UsuarioDTO getGuia() { return guia; }
    public void setGuia(UsuarioDTO guia) { this.guia = guia; }

    public boolean isAprobado() { return aprobado; }
    public void setAprobado(boolean aprobado) { this.aprobado = aprobado; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public String getNovedades() { return novedades; }
    public void setNovedades(String novedades) { this.novedades = novedades; }

    public List<ComentarioDTO> getComentarios() { return comentarios; }
    public void setComentarios(List<ComentarioDTO> comentarios) { this.comentarios = comentarios; }
}

