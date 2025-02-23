package com.proyecto.uncampus.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.uncampus.entities.Administrador;
import com.proyecto.uncampus.entities.Lugar;
import com.proyecto.uncampus.entities.Solicitud;
import com.proyecto.uncampus.repositories.LugarRepository;
import com.proyecto.uncampus.repositories.SolicitudRepository;

@Service
public class AdministradorService {

    @Autowired
    private LugarRepository lugarRepo;

    @Autowired
    private SolicitudRepository solicitudRepo;

    public Lugar aprobarLugar(Long lugarId) {
        Lugar lugar = lugarRepo.findById(lugarId)
                .orElseThrow(() -> new RuntimeException("Lugar no encontrado"));
        lugar.setAprobado(true);
        return lugarRepo.save(lugar);
    }

    // Manejar solicitudes
    public Solicitud crearSolicitud(Administrador admin, Long lugarId) {
        Lugar lugar = lugarRepo.findById(lugarId)
                .orElseThrow(() -> new RuntimeException("Lugar no encontrado"));

        Solicitud s = new Solicitud();
        s.setFecha(java.time.LocalDateTime.now());
        s.setEstado("PENDIENTE");
        s.setLugarAsociado(lugar);
        s.setAdministrador(admin);
        return solicitudRepo.save(s);
    }

    public Solicitud cambiarEstadoSolicitud(Long solicitudId, String nuevoEstado) {
        Solicitud s = solicitudRepo.findById(solicitudId)
                .orElseThrow(() -> new RuntimeException("Solicitud no encontrada"));
        s.setEstado(nuevoEstado);
        return solicitudRepo.save(s);
    }

    // ... Otros métodos
}

