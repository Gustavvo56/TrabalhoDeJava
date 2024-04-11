package com.etecja.tccfeatures.resources;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.etecja.tccfeatures.entities.Curso;
import com.etecja.tccfeatures.service.CursoService;

//@RestController
//@RequestMapping(value = "/cursos")
@Controller
public class CursoResource {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Autowired
	private CursoService cursoService;

	// Endpoints

	@GetMapping("/cursos")
	public String findAll(Model model) {
		return "cursos";
	}

	@GetMapping("/cadastro")
	public String exibirFormularioCadastro(Model model) {
		model.addAttribute("curso", new Curso());
		return "cadastro-curso";
	}

	@PostMapping("/save")
	public String salvarCurso(@ModelAttribute("curso") Curso curso) {
		cursoService.save(curso);
		return "redirect:/cursos";
	}

}
