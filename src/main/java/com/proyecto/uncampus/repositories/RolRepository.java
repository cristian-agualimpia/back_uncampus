package com.proyecto.uncampus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.uncampus.entities.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    // ...
}