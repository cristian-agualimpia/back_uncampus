package com.proyecto.uncampus.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_lugar")
public abstract class Lugar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    // Referencia opcional al 'guia' (puede ser nulo si no aplica, p. ej. en PuntosDeReferencia)
    @ManyToOne
    private Usuario guia;  

    // Aprobación: si ya fue validado por un admin
    private boolean aprobado;

    // Horario general (ej. "Lunes-Viernes, 8am - 6pm")
    private String horario;

    // Novedades: (cerrado, en mantenimiento, etc.)
    private String novedades;

    // Comentarios asociados
    @OneToMany(mappedBy = "lugar", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comentario> comentarios = new ArrayList<>();

    // Getters y setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Usuario getGuia() { return guia; }
    public void setGuia(Usuario guia) { this.guia = guia; }

    public boolean isAprobado() { return aprobado; }
    public void setAprobado(boolean aprobado) { this.aprobado = aprobado; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public String getNovedades() { return novedades; }
    public void setNovedades(String novedades) { this.novedades = novedades; }

    public List<Comentario> getComentarios() { return comentarios; }
    public void setComentarios(List<Comentario> comentarios) { this.comentarios = comentarios; }
}

