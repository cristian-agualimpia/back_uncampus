package com.proyecto.uncampus.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("GUIA")
public class Guia extends Usuario {
    // Atributos específicos si los requieres, por ahora puede quedar vacío
}

