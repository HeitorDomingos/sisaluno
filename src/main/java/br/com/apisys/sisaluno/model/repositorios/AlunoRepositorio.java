package br.com.apisys.sisaluno.model.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apisys.sisaluno.modelo.entidades.Aluno;

@Repository
public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {
//Estou usando o JPARepository porque é mais genérico que o CRUDRepository
}
