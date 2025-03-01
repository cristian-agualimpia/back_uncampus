package com.proyecto.uncampus.entities;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Lugar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String ubicacion;

    @OneToMany(mappedBy = "origen", cascade = CascadeType.ALL)
    private List<Camino> caminosDesdeOrigen = new ArrayList<>();

    public Lugar() {
    }

    public Lugar(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public List<Camino> getCaminosDesdeOrigen() {
        return caminosDesdeOrigen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setCaminosDesdeOrigen(List<Camino> caminosDesdeOrigen) {
        this.caminosDesdeOrigen = caminosDesdeOrigen;
    }
}

