package com.etecja.tccfeatures.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.etecja.tccfeatures.entities.Curso;
import com.etecja.tccfeatures.repositories.CursoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Autowired
	private CursoRepository cursoRepository;

	@Override
	public void run(String... args) throws Exception {
		//Curso c1 = new Curso(null, "Automação Industrial", "S", sdf.parse("10/04/2024"));
		//cursoRepository.saveAll(Arrays.asList(c1));
	}
}
