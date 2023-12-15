package com.bartoli.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bartoli.domain.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

	@Query(value= "SELECT * FROM curso", nativeQuery = true)
	List<Curso> getAll();
	
	@Query(value= "select * from curso where id = ?", nativeQuery = true)
	Curso getByID(Integer id);
	
}
