package com.proyecto.uncampus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.uncampus.entities.Solicitud;

public interface SolicitudRepository extends JpaRepository<Solicitud, Long> { }

