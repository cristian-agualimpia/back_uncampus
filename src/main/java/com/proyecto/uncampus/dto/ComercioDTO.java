package com.proyecto.uncampus.dto;

import java.util.ArrayList;
import java.util.List;


public class ComercioDTO extends LugarDTO {

    private List<ServicioDTO> servicios = new ArrayList<>();

    public List<ServicioDTO> getServicios() { return servicios; }
    public void setServicios(List<ServicioDTO> servicios) { this.servicios = servicios; }
}

