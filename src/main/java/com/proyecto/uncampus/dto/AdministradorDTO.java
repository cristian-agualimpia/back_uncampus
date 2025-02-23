package com.proyecto.uncampus.dto;

import java.util.ArrayList;
import java.util.List;



public class AdministradorDTO extends UsuarioDTO {
    private List<SolicitudDTO> solicitudes = new ArrayList<>();

    public List<SolicitudDTO> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<SolicitudDTO> solicitudes) {
        this.solicitudes = solicitudes;
    }
}

