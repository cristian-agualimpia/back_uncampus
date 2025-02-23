package com.proyecto.uncampus.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.uncampus.entities.Camino;

@Repository
public interface CaminoRepository extends JpaRepository<Camino, Long> { 
    List<Camino> findByOrigenId(Long origenId);
    // ...
}

