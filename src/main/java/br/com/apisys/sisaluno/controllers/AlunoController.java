package br.com.apisys.sisaluno.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.apisys.sisAluno.services.AlunoService;
import br.com.apisys.sisaluno.modelo.entidades.Aluno;

@RequestMapping(value = "aluno")
public class AlunoController {

	
	private AlunoService service;

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public ModelAndView findAll() {

		ModelAndView mv = new ModelAndView("/aluno");
		mv.addObject("alunos", service.findAll());
		System.out.println("Chamou listar!");
		return mv;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add(Aluno aluno) {

		ModelAndView mv = new ModelAndView("/alunoAdd");
		mv.addObject("aluno", aluno);

		return mv;
	}

	@RequestMapping(value ="/edit/{id}", method = RequestMethod.GET)
	public ModelAndView edit(@PathVariable("id") Long id) {

		return add(service.findOne(id));
	}

	@RequestMapping(value ="/delete/{id}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") Long id) {

		service.delete(id);

		return findAll();
	}

	@RequestMapping(value ="/save", method = RequestMethod.POST)
	public ModelAndView save(@Valid Aluno aluno, BindingResult result) {

		if (result.hasErrors()) {
			return add(aluno);
		}

		service.save(aluno);

		return findAll();
	}
	// @RequestMapping(method=RequestMethod.GET,value="/quantidade")
	// @ResponseBody
	// public void buscar() {
	//// return "Atualmente há " + alunoRepositorio.count() + " encontrados.";
	// System.out.println("Chamou /bucar");
	// }
	// @RequestMapping(method=RequestMethod.POST,value="/quantidade", consumes =
	// MediaType.APPLICATION_JSON_VALUE)

	// public void cadastrarAluno(Aluno aluno) {
	// return "Atualmente há " + alunoRepositorio.count() + " encontrados .";
	// }
}
