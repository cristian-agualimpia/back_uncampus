package com.proyecto.uncampus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.uncampus.entities.Camino;
import com.proyecto.uncampus.entities.Lugar;
import com.proyecto.uncampus.services.MapaService;

@RestController
@RequestMapping("/api/mapa")
public class MapaController {
  
    @Autowired
    private MapaService mapaService;

    @PostMapping("/lugar")
    public ResponseEntity<Lugar> crearLugar(@RequestBody Lugar lugar) {
        Lugar nuevo = mapaService.crearLugar(lugar);
        return ResponseEntity.ok(nuevo);
    }

    @PostMapping("/camino")
    public ResponseEntity<Camino> crearCamino(@RequestBody Camino camino) {
        Camino nuevo = mapaService.crearCamino(camino);
        return ResponseEntity.ok(nuevo);
    }

    @GetMapping("/rutas-cortas")
    public ResponseEntity<List<Lugar>> obtenerRutaCorta(
            @RequestParam Long origenId,
            @RequestParam Long destinoId) {
        // Invocar lógica de MapaService
        // Retornar la lista de lugares en la ruta
        return ResponseEntity.ok(/* lista de lugares del camino más corto */);
    }
    
    // Otros endpoints
}

