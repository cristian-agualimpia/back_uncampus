package com.proyecto.uncampus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.uncampus.entities.Lugar;
import com.proyecto.uncampus.entities.PuntoDeReferencia;
import com.proyecto.uncampus.entities.Usuario;
import com.proyecto.uncampus.entities copy.Comentario;
import com.proyecto.uncampus.entities copy.Visitante;
import com.proyecto.uncampus.services.VisitanteService;

@RestController
@RequestMapping("/api/visitante")
public class VisitanteController {

    @Autowired
    private VisitanteService visitanteService;

    // Sugerir un nuevo punto de referencia
    @PostMapping("/punto-referencia")
    public ResponseEntity<?> sugerirPuntoReferencia(@RequestParam String nombre,
                                                    @RequestParam String horario,
                                                    @RequestParam String novedades) {
        PuntoDeReferencia p = visitanteService.sugerirPuntoReferencia(nombre, horario, novedades);
        return ResponseEntity.ok(p.getId()); // O un DTO
    }

    // Hacer un comentario
    @PostMapping("/comentario")
    public ResponseEntity<?> comentarLugar(@RequestParam Long lugarId,
                                           @RequestParam Long usuarioId,
                                           @RequestParam String contenido) {
        // Aquí deberías obtener el usuario (por ahora simplificado):
        Usuario usuario = new Visitante(); // o un fetch real de un UserRepository
        usuario.setId(usuarioId);

        Comentario c = visitanteService.crearComentario(lugarId, usuario, contenido);
        return ResponseEntity.ok(c.getId());
    }

    // Obtener ruta corta
    @GetMapping("/ruta-corta")
    public ResponseEntity<?> obtenerRutaCorta(@RequestParam Long origenId,
                                              @RequestParam Long destinoId) {
        List<Lugar> ruta = visitanteService.obtenerRutaMasCorta(origenId, destinoId);
        // Devuelve una lista de IDs o un DTO
        return ResponseEntity.ok(ruta);
    }
}

