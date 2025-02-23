package com.proyecto.uncampus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.uncampus.entities.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> { }

