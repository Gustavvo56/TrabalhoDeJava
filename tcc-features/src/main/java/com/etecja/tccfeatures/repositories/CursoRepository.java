package com.etecja.tccfeatures.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etecja.tccfeatures.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
