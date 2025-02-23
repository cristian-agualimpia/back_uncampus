package com.proyecto.uncampus.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PUNTO_REFERENCIA")
public class PuntoDeReferencia extends Lugar {
    // No tiene atributos especiales
}

