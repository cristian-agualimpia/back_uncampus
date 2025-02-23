package com.proyecto.uncampus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.uncampus.entities.Lugar;

@Repository
public interface LugarRepository extends JpaRepository<Lugar, Long> {
    // Métodos de consulta custom si los necesitas
}
