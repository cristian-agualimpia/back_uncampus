package com.proyecto.uncampus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.uncampus.entities.Camino;
import com.proyecto.uncampus.entities.Lugar;
import com.proyecto.uncampus.repositories.CaminoRepository;
import com.proyecto.uncampus.repositories.LugarRepository;

@Service
public class MapaService {
    
    @Autowired
    private LugarRepository lugarRepository;

    @Autowired
    private CaminoRepository caminoRepository;

    public Lugar crearLugar(Lugar lugar) {
        return lugarRepository.save(lugar);
    }

    public Camino crearCamino(Camino camino) {
        return caminoRepository.save(camino);
    }

    public List<Camino> obtenerCaminosDeOrigen(Long lugarId) {
        return caminoRepository.findByOrigenId(lugarId);
    }

    // Método para calcular rutas cortas, etc.
}
