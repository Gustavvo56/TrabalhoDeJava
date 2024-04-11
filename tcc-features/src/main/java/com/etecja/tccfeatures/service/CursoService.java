package com.etecja.tccfeatures.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etecja.tccfeatures.entities.Curso;
import com.etecja.tccfeatures.repositories.CursoRepository;

@Service
public class CursoService {
	@Autowired
	private CursoRepository cursoRepository;

	public List<Curso> findAll() {
		return cursoRepository.findAll();
	}

	public void save(Curso curso) {
		cursoRepository.save(curso);
	}

}
