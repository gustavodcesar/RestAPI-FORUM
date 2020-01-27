package com.forum.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forum.apirest.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);
	
}
