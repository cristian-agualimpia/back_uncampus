package com.proyecto.uncampus.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.uncampus.entities.Comentario;
import com.proyecto.uncampus.entities.Lugar;
import com.proyecto.uncampus.entities.PuntoDeReferencia;
import com.proyecto.uncampus.entities.Usuario;
import com.proyecto.uncampus.repositories.CaminoRepository;
import com.proyecto.uncampus.repositories.ComentarioRepository;
import com.proyecto.uncampus.repositories.LugarRepository;
import com.proyecto.uncampus.repositories.PuntoDeReferenciaRepository;

@Service
public class VisitanteService {

    @Autowired
    private PuntoDeReferenciaRepository puntoRefRepo;

    @Autowired
    private ComentarioRepository comentarioRepo;

    @Autowired
    private CaminoRepository caminoRepo;

    @Autowired
    private LugarRepository lugarRepo;

    // Sugerir un nuevo punto de referencia (inicialmente aprobado=false)
    public PuntoDeReferencia sugerirPuntoReferencia(String nombre, String horario, String novedades) {
        PuntoDeReferencia p = new PuntoDeReferencia();
        p.setNombre(nombre);
        p.setHorario(horario);
        p.setNovedades(novedades);
        p.setAprobado(false);
        return puntoRefRepo.save(p);
    }

    // Crear comentario
    public Comentario crearComentario(Long lugarId, Usuario usuario, String contenido) {
        Lugar lugar = lugarRepo.findById(lugarId)
                .orElseThrow(() -> new RuntimeException("Lugar no encontrado"));

        Comentario c = new Comentario();
        c.setContenido(contenido);
        c.setFecha(java.time.LocalDateTime.now());
        c.setVotosAFavor(0);
        c.setVotosEnContra(0);
        c.setUsuario(usuario);
        c.setLugar(lugar);

        return comentarioRepo.save(c);
    }

    // Planear trayecto: retornar la lista de lugares en la ruta más corta
    public List<Lugar> obtenerRutaMasCorta(Long origenId, Long destinoId) {
        // Aquí podrías invocar algún método de un MapaService o similar
        // que use un algoritmo como Dijkstra o BFS.
        // Ejemplo simple:
        return calcularRuta(origenId, destinoId);
    }

    private List<Lugar> calcularRuta(Long origenId, Long destinoId) {
        // Implementación básica de Dijkstra o BFS
        // (Solo un esquema referencial)
        // ...
        return new ArrayList<>();
    }
}

