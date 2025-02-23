package com.proyecto.uncampus.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.uncampus.entities.Comercio;
import com.proyecto.uncampus.entities.Edificio;
import com.proyecto.uncampus.entities.Servicio;
import com.proyecto.uncampus.entities.Usuario;
import com.proyecto.uncampus.repositories.ComercioRepository;
import com.proyecto.uncampus.repositories.EdificioRepository;
import com.proyecto.uncampus.repositories.ServicioRepository;

@Service
public class GuiaService {

    @Autowired
    private EdificioRepository edificioRepo;

    @Autowired
    private ComercioRepository comercioRepo;

    @Autowired
    private ServicioRepository servicioRepo;

    // Crear un nuevo edificio
    public Edificio crearEdificio(String nombre, String dependencia, String identificador,
        boolean accesoRestringido, Usuario guia) {
        Edificio e = new Edificio();
        e.setNombre(nombre);
        e.setDependencia(dependencia);
        e.setIdentificador(identificador);
        e.setAccesoRestringido(accesoRestringido);
        e.setGuia(guia);
        e.setAprobado(false); // se puede requerir aprobación posterior
        return edificioRepo.save(e);
    }

    // Crear un nuevo comercio
    public Comercio crearComercio(String nombre, Usuario guia) {
        Comercio c = new Comercio();
        c.setNombre(nombre);
        c.setGuia(guia);
        c.setAprobado(false);
        return comercioRepo.save(c);
    }

    // Modificar servicios de un comercio
    public Servicio agregarServicioAComercio(Long comercioId, Servicio nuevoServicio) {
        Comercio com = comercioRepo.findById(comercioId)
                .orElseThrow(() -> new RuntimeException("Comercio no encontrado"));
        nuevoServicio.setComercio(com);
        return servicioRepo.save(nuevoServicio);
    }

    // ...
}

