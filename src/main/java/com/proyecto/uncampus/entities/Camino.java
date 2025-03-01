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

    private Double distancia;

    public Camino() {
    }

    public Camino(Lugar origen, Lugar destino, Double distancia) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
    }

    public Long getId() {
        return id;
    }

    public Lugar getOrigen() {
        return origen;
    }

    public Lugar getDestino() {
        return destino;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setOrigen(Lugar origen) {
        this.origen = origen;
    }

    public void setDestino(Lugar destino) {
        this.destino = destino;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }
}
