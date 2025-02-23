package com.proyecto.uncampus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.uncampus.entities.Administrador;
import com.proyecto.uncampus.entities.Lugar;
import com.proyecto.uncampus.entities.Solicitud;
import com.proyecto.uncampus.services.AdministradorService;

@RestController
@RequestMapping("/api/admin")
public class AdministradorController {

    @Autowired
    private AdministradorService adminService;

    // Aprobar lugar
    @PostMapping("/aprobar-lugar")
    public ResponseEntity<?> aprobarLugar(@RequestParam Long lugarId) {
        Lugar lugarAprobado = adminService.aprobarLugar(lugarId);
        return ResponseEntity.ok("Lugar " + lugarAprobado.getNombre() + " aprobado correctamente.");
    }

    // Manejar solicitudes
    @PostMapping("/crear-solicitud")
    public ResponseEntity<?> crearSolicitud(@RequestParam Long adminId,
                                            @RequestParam Long lugarId) {
        // Buscar administrador, simplificado
        Administrador admin = new Administrador();
        admin.setId(adminId);

        Solicitud s = adminService.crearSolicitud(admin, lugarId);
        return ResponseEntity.ok(s.getId());
    }

    @PostMapping("/cambiar-estado-solicitud")
    public ResponseEntity<?> cambiarEstadoSolicitud(@RequestParam Long solicitudId,
                                                    @RequestParam String nuevoEstado) {
        Solicitud s = adminService.cambiarEstadoSolicitud(solicitudId, nuevoEstado);
        return ResponseEntity.ok("Solicitud " + s.getId() + " ahora está en estado " + s.getEstado());
    }
}
