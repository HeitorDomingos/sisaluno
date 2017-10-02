package br.com.apisys.sisAluno.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apisys.sisaluno.model.repositorios.AlunoRepositorio;
import br.com.apisys.sisaluno.modelo.entidades.Aluno;

@Service
public class AlunoService {
	  
	  
    @Autowired
    private AlunoRepositorio repository;
     
    public List<Aluno> findAll() {
        return repository.findAll();
    }
     
    public Aluno findOne(Long id) {
        return repository.findOne(id);
    }
     
    public Aluno save(Aluno aluno) {
        return repository.saveAndFlush(aluno);
    }
     
    public void delete(Long id) {
        repository.delete(id);
    }
}
