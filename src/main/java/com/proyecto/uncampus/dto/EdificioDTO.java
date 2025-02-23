package com.proyecto.uncampus.dto;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("EDIFICIO")
public class EdificioDTO extends LugarDTO {

    // Ej: "Facultad de Ingeniería", "Rectoría", etc.
    private String dependencia;

    // Código único de la universidad, ej. "501"
    private String identificador;

    // Determina si tiene acceso restringido
    private boolean accesoRestringido;

    // Getters y setters
    public String getDependencia() { return dependencia; }
    public void setDependencia(String dependencia) { this.dependencia = dependencia; }

    public String getIdentificador() { return identificador; }
    public void setIdentificador(String identificador) { this.identificador = identificador; }

    public boolean isAccesoRestringido() { return accesoRestringido; }
    public void setAccesoRestringido(boolean accesoRestringido) { this.accesoRestringido = accesoRestringido; }
}

